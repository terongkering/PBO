import java.util.Scanner;

public class Hitunglingkaran {
    public static void main(String[] args) {
        final double PHI = 3.14;

        double radius, luas;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan radius = ");
        radius = input.nextDouble();

        luas = radius * radius * PHI;
        System.out.println("Luas lingakran = " + luas);
    }
}
