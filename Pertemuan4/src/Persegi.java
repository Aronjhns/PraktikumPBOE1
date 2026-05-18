/* Nama File		: Persegi.java
 * Deskripsi		: berisi atribut dan method dalam class Persegi, subclass BangunDatar
 * Pembuat  		: Aron Sorimuda Johanes Pasaribu
 * Tanggal	    	: 11:23 12/03/2026
 */

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
    }

    public double getSisi(){
        return this.sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return getSisi()*getSisi();
    }

    public double getKeliling(){
        return 4*getSisi();
    }

    public double getDiagonal(){
        return Math.sqrt(2)*getSisi();
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Panjang sisi: " + getSisi());
    }
}
