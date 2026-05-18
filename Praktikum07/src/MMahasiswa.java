class Mahasiswa {
    private int NIM;
    private String Nama;
    private String Programstudi;

    // 2d. Realisasi Konstruktor Mahasiswa default
    public Mahasiswa(){
        this.NIM = -999;
        this.Nama = "n/a";
        this.Programstudi = "Kosong";
    }

    // 2c. Realisasi Konstruktor Mahasiswa dengan 3 parameter
    public Mahasiswa(int NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Prodi;
    }

    // 23. Realisasi Konstruktor Mahasiswa 
    public Mahasiswa(Mahasiswa M){
        this.NIM = M.getNIM();
        this.Nama = M.getNama();
        this.Programstudi = M.getProgramStudi();
    }

    public void setNIM(int NIM){
        this.NIM = NIM;
    }

    public int getNIM(){
        return this.NIM;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getNama(){
        return this.Nama;
    }

    public void setProgramStudi(){
        this.Programstudi = "Kosong";
    }

    public void setProgramStudi(String ProgramStudi){
        this.Programstudi = ProgramStudi;
    }

    public void setProgramStudi(Mahasiswa M){
        this.Programstudi = M.getProgramStudi();
    }

    public String getProgramStudi(){
        return this.Programstudi;
    }

    public void infoMhs(){
        System.out.println("NIM             : " + this.NIM);
        System.out.println("Nama            : " + this.Nama);
        System.out.println("Program Studi   : " + this.Programstudi);
    }

}

public class MMahasiswa {
    public static void main (String[] args) {

        // 2d. Aplikasi Konstruktor Mahasiswa default
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("--- Mahasiswa Pertama ---");
        // Aplikasi tampilkan info
        m1.infoMhs();
        m1.setNIM(555);
        m1.setNama("Johan");
        m1.setProgramStudi("Arsitektur");

        System.out.println("\n--- Mahasiswa pertama setelah informasi di set ---");
        m1.infoMhs();

        // 2c. Aplikasi Konstruktor Mahasiswa dengan 3 parameter
        Mahasiswa m2 = new Mahasiswa(123, "Joe", "Informatika");
        
        // 2b. Aplikasi operator Mahasiswa
        System.out.println("\n--- Mahasiswa Kedua ---");
        // Aplikasi getter
        m2.getNIM();
        m2.getNama();
        m2.getProgramStudi();

        // Aplikasi setter
        m2.setNIM(234);
        m2.setNama("Jane");
        m2.setProgramStudi("Biologi");
        m2.infoMhs();

        // 2e. Aplikasi Konstruktor Mahasiswa dari Mahasiswa lainnya
        Mahasiswa m3 = new Mahasiswa(m1);
        System.out.println("\n--- Mahasiswa Ketiga ---");
        m3.infoMhs();
    }
}
