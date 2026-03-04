/* Nama File		: MTitik.java
 * Deskripsi		: Merupakan file main untuk class titik
 * Pembuat		    : Aron Sorimuda Johanes Pasaribu
 * Tanggal		    : 17:46 19/02/2026
 */

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(); // Membuat objek titik T1(0,0)
        T1.setAbsis(3); // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 ke layat
        T1.geser(3,4); // menggeser T1 sejauh (3,4)
        T1.printTitik(); // menampilkan koordinat T1 setelah digeser
        
        // ----------Pertemuan 2----------

        // Bagian 2 - Object Reference
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        // Bagian 3 - Overloading Constructor
        Titik T3 = new Titik(5,5);
        T3.printTitik();

        // Bagian 4 - Static Attribute & Method
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
    }
}