// 3. Kelas OperatorGenerik
class OperatorGenerik {
    
    // 3a. Realisasi prosedur generik Tukar
    public <T> void Tukar(T a, T b) {
        System.out.println("   Sebelum:\na = " + a + "\nb = " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("   Setelah:\na = " + a + "\nb = " + b);
    }

    // 3c. Fungsi generik Bobot2 (menerima masukan dua objek keturunan Kucing)
    // Menggunakan <T extends Kucing> untuk membatasi tipe generik
    public <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}

public class MainOperatorGeneric {
    public static void main(String[] args) {
        OperatorGenerik op = new OperatorGenerik();

        System.out.println("--- 3b. Aplikasi Prosedur Tukar ---");
        
        System.out.println("Penukaran sesama Integer:");
        op.Tukar(3, 6);

        System.out.println("\nPenukaran sesama String:");
        op.Tukar("Halo", "Dunia");

        System.out.println("\nPenukaran sesama keluarga Anabul:");
        Anabul anjing = new Anjing("Heli");
        Anabul kucing = new Anggora("Milo", 4.0);
        op.Tukar(anjing, kucing);

        System.out.println("\n--- 3c. Aplikasi Fungsi Bobot ---");
        Anggora k1 = new Anggora("Luna", 3.2);
        Kembangtelon k2 = new Kembangtelon("B belang", 4.5);
        
        double totalBobot = op.Bobot2(k1, k2);
        System.out.println("Kucing 1: " + k1.infoAnabul());
        System.out.println("Kucing 2: " + k2.infoAnabul());
        System.out.println("Total bobot kedua kucing: " + totalBobot + " kg");
    }
}