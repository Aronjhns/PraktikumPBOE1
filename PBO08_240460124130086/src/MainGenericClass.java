// --- Kelas Dasar Anabul ---
abstract class Anabul {
    protected String nama;
    protected String jenis;

    public Anabul(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama; 
    }

    public String infoAnabul() {
        return jenis + " bernama " + nama;
    }

    @Override
    public String toString() {
        return infoAnabul();
    }
}

class Anjing extends Anabul {
    public Anjing(String nama) { 
        super(nama, "Anjing"); 
    }
}

class Burung extends Anabul {
    public Burung(String nama) { 
        super(nama, "Burung"); 
    }
}

class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot, String jenis) {
        super(nama, jenis);
        this.bobot = bobot;
    }

    public double getBobot() { return bobot; }
    
    @Override
    public String infoAnabul() {
        return super.infoAnabul() + ", berat:" + bobot + " kg";
    }
}

class Anggora extends Kucing {
    public Anggora(String nama, double bobot) { 
        super(nama, bobot, "Kucing Anggora"); 
    }
}

class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) { 
        super(nama, bobot, "Kucing Kembangtelon"); 
    }
}

// 2. Kelas generik Datum 
class Datum<T> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}

// Aplikasi Kelas Generik
public class MainGenericClass {
    public static void main(String[] args) {
        System.out.println("--- 2. Aplikasi Generik pada Class dan Datum ---");
        
        Datum<Anabul> datum1 = new Datum<>();
        datum1.setIsi(new Anggora("Molly", 3.5));
        System.out.println("Isi Datum 1: " + datum1.getIsi().infoAnabul());
        
        Datum<Anabul> datum2 = new Datum<>();
        datum2.setIsi(new Anjing("Max"));
        System.out.println("Isi Datum 2: " + datum2.getIsi().infoAnabul());
    }
}