// Nama : Hezkiel Bram Setiawan
// NIM  : M0521030

public class PPBO_03_Latihan4 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        // for (int i = 1; i < 6; i++) {
        //     System.out.println("elemen ke-" + i + " = " + arr[i]);
        // }

        // PERBAIKAN
        int i = 0;
        do {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        } while (++i < 5);
    }
}

// Melanjutkan source code Latihan3 yang sudah diperbaiki, ubahlah source code dengan 
// mengganti dari perulangan FOR menjadi menggunakan DO ... WHILE