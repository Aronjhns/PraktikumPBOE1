/* Nama File		: BangunDatar.java
 * Deskripsi		: berisi atribut dan method dalam class BangunDatar
 * Pembuat  		: Aron Sorimuda Johanes Pasaribu
 * Tanggal	    	: 11:23 12/03/2026
 */

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        counterBangunDatar++;
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public int getJmlSisi(){
        return this.jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return this.warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return this.border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}
