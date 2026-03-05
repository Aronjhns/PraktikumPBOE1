/* Nama File		: MataKuliah.java
 * Deskripsi		: berisi atribut dan method dalam class MataKuliah
 * Pembuat		    : Aron Sorimuda Johanes Pasaribu
 * Tanggal		    : 12:00 05/03/2026
 */

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private Integer sks;

    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String newIdMatKul, String newNamaMatKul, int newSks) { 
        this.idMatKul = newIdMatKul;
        this.nama = newNamaMatKul;
        this.sks = newSks;
    }

    public String getIdMatKul() {
        return this.idMatKul;
    }

    public String getNamaMatKul() {
        return this.nama;
    }

    public int getSks() {
        return this.sks;
    }

    public void setIdMatKul(String IdMatKul) {
        this.idMatKul = IdMatKul;
    }

    public void setNamaMatKul(String NamaMatKul) {
        this.nama = NamaMatKul;
    }

    public void setSks(int Sks) {
        this.sks = Sks;
    }
}