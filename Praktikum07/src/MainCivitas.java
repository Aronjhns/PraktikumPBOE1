// 4a. Kelas Rujukan Civitasakademika
abstract class Civitasakademika {
    protected String nama;

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }
    
    // Fungsi abstrak yang menyesuaikan NIM/NIP di kelas anak
    public abstract String getNomor();
}

// 4a. Kelas Anak: Dosen
class Dosen extends Civitasakademika {
    private String nip;

    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    @Override
    public String getNomor() { return nip; }
}

// 4a. Kelas Anak: Mahasiswa
class Mahasiswa extends Civitasakademika {
    private String nim;
    private Dosen dosenwali;

    public Mahasiswa(String nim, String nama) {
        super(nama);
        this.nim = nim;
        this.dosenwali = null; 
    }

    @Override
    public String getNomor() { return nim; }

    // 4i. Prosedur setWali
    public void setWali(Dosen d) {
        this.dosenwali = d;
    }

    // 4j. Prosedur tampilDataMahasiswa
    public void tampilDataMahasiswa() {
        String namaWali = (dosenwali != null) ? dosenwali.getNama() : "Belum ditentukan";
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Dosen Wali: " + namaWali);
    }
}

// 4b. Kelas Aplikator Seminar
class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    public Seminar() {
        this.pesertas = new Civitasakademika[100]; // kapasitas maks 100
        this.banyakpeserta = 0; // inisialisasi nol
    }

    // 4c. Fungsi countPeserta
    public int countPeserta() {
        return banyakpeserta;
    }

    // 4d. Prosedur registrasi
    public void registrasi(Civitasakademika peserta) {
        if (banyakpeserta < pesertas.length) {
            pesertas[banyakpeserta] = peserta; // kontigu (indeks tidak melompat)
            banyakpeserta++;
            System.out.println("Berhasil mendaftar: " + peserta.getNama());
        } else {
            System.out.println("Seminar penuh!");
        }
    }

    // 4g. Prosedur tampilPeserta
    public void tampilPeserta() {
        System.out.println("\n--- Daftar Peserta ---");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i+1) + ". Nomor: " + pesertas[i].getNomor() + " - Nama: " + pesertas[i].getNama());
        }
    }

    // 4h. Fungsi countMahasiswa dengan instanceof
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}

// Program Utama
public class MainCivitas {
    public static void main(String[] args) {
        // 4e. Buat 2 objek dosen dan 5 objek mahasiswa
        Dosen d1 = new Dosen("198001", "Dr. Budi");
        Dosen d2 = new Dosen("198002", "Prof. Siti");

        Mahasiswa m1 = new Mahasiswa("21001", "Ali");
        Mahasiswa m2 = new Mahasiswa("21002", "Bagas");
        Mahasiswa m3 = new Mahasiswa("21003", "Caca");
        Mahasiswa m4 = new Mahasiswa("21004", "Deni");
        Mahasiswa m5 = new Mahasiswa("21005", "Eka");

        // 4i. Aplikasi setWali di main
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        // m4 dan m5 belum di-set walinya (opsional untuk test)

        // Buat objek Seminar
        Seminar sem = new Seminar();

        // 4f. Uji prosedur Registrasi dengan ketujuh objek
        System.out.println("--- Registrasi ---");
        sem.registrasi(d1);
        sem.registrasi(d2);
        sem.registrasi(m1);
        sem.registrasi(m2);
        sem.registrasi(m3);
        sem.registrasi(m4);
        sem.registrasi(m5);

        // 4c. Aplikasi countPeserta
        System.out.println("\nTotal Peserta: " + sem.countPeserta());

        // 4g. Aplikasi tampilPeserta
        sem.tampilPeserta();

        // 4h. Aplikasi countMahasiswa
        System.out.println("\nJumlah Peserta Mahasiswa: " + sem.countMahasiswa());

        // 4j. Aplikasi tampilDataMahasiswa
        System.out.println("\n--- Data Mahasiswa ---");
        m1.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}