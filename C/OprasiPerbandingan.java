import java.util.Scanner;

public class OprasiPerbandingan {

    public static void main(String[] args) {
        int bilangan_1, bilangan_2, bilangan_3;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan bil pertama = ");
        bilangan_1 = input.nextInt();
        System.out.print("Masukan bil kedua = ");
        bilangan_2 = input.nextInt();
        System.out.print("Masukan bil ketiga = ");
        bilangan_3 = input.nextInt();

        boolean equal = bilangan_1 == bilangan_2;
        boolean lebih_kecil = bilangan_1 < bilangan_2;
        boolean lebih_kecil_equal = bilangan_1 <= bilangan_2;
        boolean lebih_besar = bilangan_1 > bilangan_2;
        boolean lebih_besar_equal = bilangan_1 >= bilangan_2;

        System.out.println('\n');
        System.out.println("bilangan_1 == bilangan_2 = " + equal);
        System.out.println("bilangan_1 < bilangan_2 = " + lebih_kecil);
        System.out.println("bilangan_1 <= bilangan_2 = " + lebih_kecil_equal);
        System.out.println("bilangan_1 > bilangan_2 = " + lebih_besar);
        System.out.println("bilangan_1 >= bilangan_2 = " + lebih_besar_equal);
    }
}