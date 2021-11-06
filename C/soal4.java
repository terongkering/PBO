import java.util.Scanner;
class soal4 {
    public static void main(String[] args) {
        double angka;
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("Masukan Angka Terakhir Nim Anda :");
        angka = input.nextDouble();

        if (angka / 3 == 0) {
            System.out.println("Bilangan Kelipatan 3");
        }
        else {
            System.out.println("Bukan Bilangan Kelipatan 3");
        }
        
    }
}
