// 4a. Realisasi kelas Data
class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        // Larik statik berisi 100 elemen generik
        ruang = (T[]) new Object[100]; 
        banyak = 0;
    }

    // 4b. Prosedur setIsi (parameter angka {1..100} dan objek generik)
    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            // Jika posisi tersebut sebelumnya kosong, tambah counter banyak
            if (ruang[posisi - 1] == null && objek != null) {
                banyak++;
            } else if (ruang[posisi - 1] != null && objek == null) {
                banyak--; // Jika mengosongkan elemen
            }
            // Konversi indeks 1..100 ke indeks array 0..99
            ruang[posisi - 1] = objek; 
        } else {
            System.out.println("Error: Posisi " + posisi + " di luar batas ruang (1-100)!");
        }
    }

    // 4c. Fungsi getIsi (mengembalikan elemen pada posisi tertentu)
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return ruang[posisi - 1];
        }
        return null; // Kembalikan null jika posisi tidak valid
    }

    // 4d. Fungsi getSize (mengembalikan banyak elemen efektif)
    public int getSize() {
        return banyak;
    }
}

public class MainLarikGenerik {
    public static void main(String[] args) {
        System.out.println("--- Aplikasi Larik Generik ---");
        
        Data<Anabul> databaseAnabul = new Data<>();

        databaseAnabul.setIsi(1, new Anggora("Kitty", 2.5));
        databaseAnabul.setIsi(2, new Burung("Rio"));
        databaseAnabul.setIsi(3, new Anjing("Spike"));

        // Gunakan tampilInformasi() alih-alih membiarkan Java memanggil toString()
        if (databaseAnabul.getIsi(1) != null) {
            System.out.println("Posisi 1: " + databaseAnabul.getIsi(1).infoAnabul());
        }
        if (databaseAnabul.getIsi(2) != null) {
            System.out.println("Posisi 2: " + databaseAnabul.getIsi(2).infoAnabul());
        }
        if (databaseAnabul.getIsi(3) != null) {
            System.out.println("Posisi 3: " + databaseAnabul.getIsi(3).infoAnabul());
        }

        System.out.println("\nTotal elemen: " + databaseAnabul.getSize());
    }
}