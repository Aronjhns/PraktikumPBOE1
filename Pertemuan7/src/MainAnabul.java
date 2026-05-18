// Superclass Anabul
abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    // Metode yang akan di-override oleh kelas anak
    public abstract void gerak();
    public abstract void bersuara();
}

// Subclass Anabul, Kucing
class Kucing extends Anabul {
    public Kucing(String nama) { super(nama); }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " mengeong");
    }
}

// Subclass Anabul, Anjing
class Anjing extends Anabul {
    public Anjing(String nama) { super(nama); }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " menggonggong");
    }
}

// Subclass Anabul, Burung
class Burung extends Anabul {
    public Burung(String nama) { super(nama); }

    @Override
    public void gerak() {
        System.out.println(nama + " terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersiul");
    }
}

// Program Utama
public class MainAnabul {
    public static void main(String[] args) {
        
        // Konstruktor memanggil superclass Anabul
        Anabul kucing = new Kucing("Joko");
        Anabul anjing = new Anjing("Sapardi");
        Anabul burung = new Burung("Jena");

        // Memanggil metode yang sama, tapi hasil (perilaku) berbeda
        kucing.bersuara();
        kucing.gerak();
        System.out.println();

        anjing.bersuara();
        anjing.gerak();
        System.out.println();

        burung.bersuara();
        burung.gerak();
    }
}