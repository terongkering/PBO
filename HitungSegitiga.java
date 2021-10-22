import java.util.Scanner;

class HitungSegitiga {
    public static void main(String[] args){
        double tinggi;
        double alas;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan alas = ");
        alas = input.nextDouble();

        System.out.print("Masukan tinggi = ");
        tinggi = input.nextDouble();

        double luas = alas * tinggi / 2;

        System.out.print("Luas Segitiga = " + luas);

    }
}
