package java_method;

import java.util.Scanner;

public class no_3 {
    static void polaBintang (int N) {//jumlah baris -> N
            for (int i = 1 ; i <= N; i++) {//baris
                for (int j = 1; j <= i; j++) {//jumlah bintang
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan nilai : ");
        int N = userInput.nextInt();
        
        if (N > 0 && N <= 1000) {
            polaBintang(N);
        } else {
            System.out.println("Tidak Ada Hasil Untuk Nilai " + N);
        }
        userInput.close();
    }
}
