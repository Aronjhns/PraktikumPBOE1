/* Nama File		: Dosen.java
 * Deskripsi		: berisi atribut dan method dalam class Dosen
 * Pembuat		    : Aron Sorimuda Johanes Pasaribu
 * Tanggal		    : 12:00 05/03/2026
 */

public class Dosen {
    private String nama;
    private String nip;
    private String prodi;

    public Dosen(){
        this.nama = "";
        this.nip = "";
        this.prodi = "";
    }

    public Dosen(String nama, String nip, String prodi){
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNip(){
        return this.nip;
    }

    public String getProdi(){
        return this.prodi;
    }

    public void setNama(String Nama){
        this.nama = Nama;
    }

    public void setNip(String Nip){
        this.nip = Nip;
    }

    public void setProdi(String Prodi){
        this.prodi = Prodi;
    }
}