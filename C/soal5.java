import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        
        int bilangan_1;
        int jumlah = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 7; i = i + 1) {
            System.out.print("Bilangan Pertama : ");
            bilangan_1 = input.nextInt();
            jumlah = jumlah + bilangan_1;
        }
        System.out.println("Total angka = " + jumlah);
    }
}
