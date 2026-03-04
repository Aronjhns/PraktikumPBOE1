/* Nama File		: Titik.java
 * Deskripsi		: berisi atribut dan method dalam class Titik
 * Pembuat		    : Aron Sorimuda Johanes Pasaribu
 * Tanggal		    : 17:46 19/02/2026
 */

public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;

    // Bagian 4 - Static Attribute
    static int counterTitik = 0;

    /***************METHOD***************/
    // konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Bagian 3 - Overloading Constructor
    // konstruktor untuk membuat titik (x,y)
    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Bagian 4 - Static Method
    static int getCounterTitik(){
        return counterTitik;
    }

    // mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }
    
    // mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }
    
    // mengeset ordinat titik dengan nilai baru x
    void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;

    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} // end class Titik