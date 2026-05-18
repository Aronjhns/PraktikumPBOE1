public class adHocCoersion {
    public static void main (String[] args) {
        // 1a. integer ke karakter, real, dan string serta string ke int dan real
        int x = 65;
        String angka = "67";

        System.out.println(x);
        System.out.println((char) x);
        System.out.println((double) x);
        System.out.println(Integer.toString(x));
        System.out.println(Integer.parseInt(angka));
        System.out.println(Double.parseDouble(angka));

        // 1b. integer ke real kemudian ke integer dalam variabel berbeda
        double real_x = (double) x; // ubah dari int ke real
        int int_x = (int) real_x; // ubah dari real ke int kembali
        System.out.println(int_x);

        // 1c. Konkatenasi dan penjumlahan dari string (integer)
        String X = "1234";
        String Y = "5678";

        String S = X + Y; // tipe data String karena konkatenasi
        int Z = Integer.parseInt(X) + Integer.parseInt(Y); // tipe data int karena dijumlahkan 

        System.out.println(S);
        System.out.println(Z);

        // 1d. Konkatenasi dan penjumlahan dari string (double)
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q; // tipe data String karena konkatenasi
        double D = Double.parseDouble(P) + Double.parseDouble(Q); // tipe data double karena dijumlahkan

        System.out.println(R);
        System.out.println(D);

        // 1e. Integer A, konversi dari S
        int A = Integer.parseInt(S);
        System.out.println(A);

        // 1f. String T, konversi dari A
        String T = Integer.toString(A);
        System.out.println(T);
    }
}
