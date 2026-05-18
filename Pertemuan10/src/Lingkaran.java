/* Nama File		: Lingkaran.java
 * Deskripsi		: berisi atribut dan method dalam class Lingkaran, subclass BangunDatar
 * Pembuat  		: Aron Sorimuda Johanes Pasaribu
 * Tanggal	    	: 11:23 12/03/2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(){
        setJmlSisi(1);
        this.jari = 0;
    }
    
    public Lingkaran(double diameter, String warna, String border){
        super(1, warna, border);
        this.jari = diameter/2;
        // setJmlSisi(1);
        // setWarna(warna);
        // setBorder(border);
    }

    public double getJari(){
        return this.jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI*getJari()*getJari();
    }

    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari-jari: " + getJari());
    }
}
