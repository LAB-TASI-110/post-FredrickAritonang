package driver;

import java.util.Scanner;
import model.Model2;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int N = input.nextInt();

        
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = input.nextInt();
        }

        
        int kategori = input.nextInt();

        
        int hasil = Model2.hitungStok(data, kategori);

        
        System.out.println(hasil);

        input.close();
    }
}
