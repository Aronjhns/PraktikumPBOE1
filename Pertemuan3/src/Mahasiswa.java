/* Nama File		: Mahasiswa.java
 * Deskripsi		: berisi atribut dan method dalam class Mahasiswa
 * Pembuat		    : Aron Sorimuda Johanes Pasaribu
 * Tanggal		    : 12:00 05/03/2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public int getJumlahSKS(){
        int i;
        int total = 0;

        for (i=0; i<listMatkul.size(); i++) {
            total = total + listMatkul.get(i).getSks();
        }

        return total;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public String getNim(){
        return this.nim;
    }

    public String getNamaMhs(){
        return this.nama;
    }

    public String getProdiMhs(){
        return this.prodi;
    }

    public ArrayList<MataKuliah> getListMatkul(){
        return listMatkul;
    }

    public Dosen getDosen(){
        return this.dosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNamaMhs(String NamaMhs){
        this.nama = NamaMhs;
    }

    public void setProdi(String Prodi){
        this.prodi = Prodi;
    }

    public void setDosen(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul (MataKuliah mataKuliah){
        listMatkul.add(mataKuliah);
    }

    public void printMhs(){
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Program Studi : " + this.prodi);
    }

    public void printDetailMhs(){
        int i;

        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Program Studi : " + this.prodi);
        System.out.println("List Mata Kuliah:");
        for(i=0; i<listMatkul.size(); i++){
            System.out.println("- " + listMatkul.get(i).getNamaMatKul());
        }
        System.out.println("Dosen Wali : " + this.dosenWali.getNama());
        System.out.println("Kendaraan : " + this.kendaraan.getJenis());
    }
}
