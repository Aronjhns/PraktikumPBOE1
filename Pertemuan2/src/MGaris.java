/* Nama File		: MGaris.java
 * Deskripsi		: merupakan file main untuk class Garis
 * Pembuat		    : Aron Sorimuda Johanes Pasaribu
 * Tanggal		    : 16:05 04/03/2026
 */

public class MGaris {
    public static void main(String[] args){
        // buat garis tanpa titik awal dan akhir tertentu
        System.out.println("Membuat garis tanpa parameter. T0 (0,0) T1 (1,1)");
        Garis G1 = new Garis();

        // menampilkan titik awal dan titik akhir garis
        G1.printGaris();
        System.out.println("\n");

        // buat garis dengan titik awal dan akhir tertentu
        System.out.println("Membuat garis dengan parameter");
        Garis G2 = new Garis(3,4,10,2);
        G2.printGaris();
        System.out.println("\n");

        // ambil titik awal dan akhir sebuah garis
        System.out.println("Titik awal dan akhir garis G2 adalah");
        G2.getTitikAwal().printTitik();
        G2.getTitikAkhir().printTitik();
        System.out.println("\n");

        // set titik awal dan akhir sebuah garis
        System.out.println("Garis G1 setelah diset titik awal (2,2) titik akhir (3,6) menjadi");
        G1.setTitikAwal(2, 2);
        G1.setTitikAkhir(3, 6);
        G1.printGaris();
        System.out.println("\n");

        // translasi garis
        System.out.println("Garis G2 ditranslasikan oleh (2,3) menjadi");
        G2.Translasi(2,3);
        G2.printGaris();
        System.out.println("\n");

        // print banyaknya garis
        System.out.println("Banyaknya garis adalah");
        System.out.println(Garis.getCounterGaris());
        System.out.println("\n");
        
        // menghitung gradien
        System.out.println("Gradien garis G1 adalah");
        System.out.println(G1.getGradien());
        System.out.println("\n");

        // menghitung titik tengah garis
        System.out.println("Titik tengah garis G2 adalah");
        G2.getTitikTengah().printTitik();
        System.out.println("\n");

        // mengecek apakah garis G1 dan G2 sejajar
        System.out.println("Apakah G1 dan G2 sejajar");
        G1.isParallelWith(G2);
        System.out.println("\n");

        // mengecek apakah garis G1 dan G2 tegak lurus
        System.out.println("Apakah G1 dan G2 tegak lurus");
        G1.isPerpendicularWith(G2);
        System.out.println("\n");

        // mencetak persamaan garis lurus sebuah garis
        System.out.println("Persamaan garis lurus G1 adalah");
        G1.printLineEquation();
        System.out.println("\n");
    }
}
