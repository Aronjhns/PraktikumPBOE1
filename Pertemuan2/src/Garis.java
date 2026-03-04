/* Nama File		: Garis.java
 * Deskripsi		: berisi atribut dan method untuk class Garis 
 * Pembuat		    : Aron Sorimuda Johanes Pasaribu
 * Tanggal		    : 16:05 04/03/2026
 */

public class Garis {
    /**********ATRIBUT**********/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris;

    /**********METHOD**********/
    // 2a. Konstruktor tanpa parameter
    Garis(){
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    // 2b. Konstruktor dengan parameter titik awal dan titik akhir
    Garis(double absTitikAwal, double ordTitikAwal, double absTitikAkhir, double ordTitikAkhir){
        titikAwal = new Titik(absTitikAwal, ordTitikAwal);
        titikAkhir = new Titik(absTitikAkhir, ordTitikAkhir);
        counterGaris++;
    }

    // Selektor-selektor

    // Start of 2c
    // mengembalikan titik awal sebuah garis
    Titik getTitikAwal(){
        return this.titikAwal;
    }

    // mengembalikan titik akhir sebuah garis
    Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    // mengembalikan jumlah garis yang ada
    static int getCounterGaris(){
        return counterGaris;
    }

    // mengeset titik awal sebuah garis ke koordinat (x,y)
    void setTitikAwal(double x, double y){
        this.titikAwal.absis = x;
        this.titikAwal.ordinat = y;
    }

    // mengeset titik akhir sebuah garis ke koordinat (x,y)
    void setTitikAkhir(double x, double y){
        this.titikAkhir.absis = x;
        this.titikAkhir.ordinat = y;
    }

    // melakukan translasi terhadap garis
    void Translasi(double x, double y){
        titikAwal.absis = getTitikAwal().getAbsis() + x;
        titikAwal.ordinat = getTitikAwal().getOrdinat() + y;
        titikAkhir.absis = getTitikAkhir().getAbsis() + x;
        titikAkhir.ordinat = getTitikAkhir().getOrdinat() + y;
    }

    // End of 2c

    // 2d. mengembalikan panjang garis
    double getLength(){
        return Math.sqrt(((titikAkhir.getAbsis() - titikAwal.getAbsis()) * (titikAkhir.getAbsis() - titikAwal.getAbsis())) + ((titikAkhir.getOrdinat() - titikAwal.getOrdinat()) * (titikAkhir.getOrdinat() - titikAwal.getOrdinat())));
    }

    // 2e. mengembalikan gradien garis
    double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat())/(titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // 2f. mengembalikan titik tengah dari sebuah garis 
    Titik getTitikTengah(){
        return new Titik((titikAwal.absis + titikAkhir.absis)/2,(titikAwal.ordinat + titikAkhir.ordinat)/2);
    }

    // 2g. mengecek apakah sebuah garis sejajar dengan garis lain
    void isParallelWith(Garis G){
        if(this.getGradien() == G.getGradien()){
            System.out.println("Iya");
        }
        else
            System.out.println("Tidak");
    }

    // 2h. mengecek apakah sebuah garis tegak lurus dengan garis lain
    void isPerpendicularWith(Garis G){
        if(this.getGradien() * G.getGradien() == -1){
            System.out.println("Iya");
        }
        else
            System.out.println("Tidak");
    }

    // 2i. mencetak titik awal dan titik akhir garis ke layar
    void printGaris(){
        System.out.println("Titik Awal : (" + getTitikAwal().absis + "," + getTitikAwal().ordinat + "), " + "Titik Akhir : (" + getTitikAkhir().absis + "," + getTitikAkhir().ordinat + ")");
    }

    // 2j. mencetak persamaan garis lurus sebuah garis
    void printLineEquation(){
        System.out.println("y = " + this.getGradien() + "x + (" + (this.titikAwal.getOrdinat() - this.getGradien() * this.titikAwal.getAbsis()) + ")");
    }
}