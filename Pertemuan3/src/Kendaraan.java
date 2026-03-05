/* Nama File		: Kendaraan.java
 * Deskripsi		: berisi atribut dan method dalam class Kendaraan
 * Pembuat		    : Aron Sorimuda Johanes Pasaribu
 * Tanggal		    : 12:00 05/03/2026
 */

public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setNoPlat(String NoPlat){
        this.noPlat = NoPlat;
    }

    public void setJenis(String Jenis){
        this.jenis = Jenis;
    }
}
