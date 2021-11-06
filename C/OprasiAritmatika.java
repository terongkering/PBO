import java.util.Scanner;
public class OprasiAritmatika 
{
    public static void main(String[] args){
        int bilangan_1 = 18;
        int bilangan_2 = 7 ;
        int bilangan_3 = 9 ;
        
        int penjumlahan = bilangan_1 + bilangan_2 + bilangan_3;
        int perkalian = bilangan_1 * bilangan_2 * bilangan_3;
        double pembagian = bilangan_1 / bilangan_2;
        int modulo = bilangan_1 % bilangan_2;

        System.out.println("Total penjumlahan = " + penjumlahan);
        System.out.println("Total perkalian = " + perkalian);
        System.out.println("Hasil pembagian = " + pembagian);
        System.out.println("Sisa hasil bagi = " + modulo);
    }
}
