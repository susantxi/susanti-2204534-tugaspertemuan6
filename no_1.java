package java_method;

import java.util.Scanner;

public class no_1 {  
    static void cekRibuan(int i, int bil){
        if(bil >= 1000 && bil <= 9999){
            System.out.println("Bilangan ke-" + (i+1) + " merupakan bilangan ribuan");
        }else{
            System.out.println("Bilangan ke-" + (i+1) + " bukan bilangan ribuan");
        }
    }
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int[] bilangan = new int[3];
        for (int i = 0; i < 3; i++){
            System.out.printf("Masukkan bilangan ke-%d: ", i+1);
            bilangan[i] = userInput.nextInt();
        }
        
        System.out.println();
        
        for(int i = 0; i  < 3; i++){
            cekRibuan(i, bilangan[i]);
        }
        userInput.close();
    }
}
