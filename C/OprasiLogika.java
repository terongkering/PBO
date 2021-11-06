import java.util.Scanner;

public class OprasiLogika {

    public static void main(String[] args) {
        int bilangan_1, bilangan_2, bilangan_3;
        Scanner input = new Scanner (System.in);

        System.out.println("Masukan bilangan pertama = ");
        bilangan_1 = input.nextInt();
        System.out.println("Masukan bilangan kedua = ");
        bilangan_2 = input.nextInt();
        System.out.println("Masukan bilangan ketiga = ");
        bilangan_3 = input.nextInt();

        boolean dan = bilangan_1 == bilangan_2 && bilangan_1 == bilangan_2;
        boolean atau = bilangan_1 < bilangan_2 || bilangan_3 == bilangan_3;
        boolean negasi = ! atau;

        System.out.println("n/");
        System.out.println("bilangan_1 == bilangan_2 && bilangan_1 == bilangan_2 = " + dan);
        System.out.println("bilangan_1 < bilangan_2 || bilangan_3 == bilangan_2 = " + atau);
        System.out.println(" ! atau = " + negasi);
        System.out.println();

    }
}