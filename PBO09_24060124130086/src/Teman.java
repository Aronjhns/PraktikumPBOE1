import java.util.*;

public class Teman {
    private ArrayList<String> Lnama;
    private int nbelm;

    public Teman() {
        Lnama = new ArrayList<String>();
        nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        else {
            return null;
        }
    }

    
    public void setNama(int indeks, String nama) {
        if (indeks <= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        }
    }
        
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            Lnama.set(indeks, namabaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        for (String nama : Lnama) {
            System.out.println(nama);
        }
    }
}