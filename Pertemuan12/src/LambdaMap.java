/**
 * File     : LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map
 */

import java.util.HashMap;

public class LambdaMap {
    public static void main(String [] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24010", "Aron");
        mahasiswaMap.put("24020", "Bagas");
        mahasiswaMap.put("24030", "Cere");
        mahasiswaMap.put("24040", "Duku");

        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((key, value) -> {
            System.out.println("NIM: " + key + ", Nama: " + value);
        });
    }
}
