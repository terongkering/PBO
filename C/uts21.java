import java.util.Scanner;

public class uts21{
    public static void main(String[] args){
        double[] angka;
        int jumlahAngka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah angka ");
        jumlahAngka = input.nextInt();
        
        angka = new double[jumlahAngka];

        angka = inputNilaiArray(jumlahAngka);
        double total = jumlahArray(angka, jumlahAngka);

        System.out.println("Masukan jumlah = " + total);
        System.out.println("Rata-rata = " + average(total, jumlahAngka));
        System.out.println("Perkalian array = " + perkalianArray(angka, jumlahAngka));
    }

    public static double jumlahArray(double[] angka, int jumlahAngka){
        double total = 0;
        for(int i=0; i < jumlahAngka; i++){
            total = total + angka[i]; 
        }

        return total;
    }

    public static double perkalianArray(double[] angka, int jumlahAngka){
        double total = 1;
        for(int i=0; i < jumlahAngka; i++){
            total = total + angka[i]; 
        }

        return total;
    }

    public static double average(double total, int jumlahAngka){
        return total / jumlahAngka;
    }

    public static double[] inputNilaiArray(int jumlahAngka){
        Scanner input = new Scanner(System.in);
        double[] angka;
        angka = new double[jumlahAngka];
        for (int i=0; i < jumlahAngka; i++){
            System.out.print("Masukan bilangan pecahan " + i + " ");
            angka[i] = input.nextDouble();
        }

        return angka;
    }
}