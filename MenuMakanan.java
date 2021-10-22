import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        int nomor_menu;
        
        System.out.println("+------------------+");
        System.out.println("|    pilih menu    |");
        System.out.println("+------------------+");
        System.out.println("|1. Nasi Goreng    |");
        System.out.println("|2. Nasi Bebek     |");
        System.out.println("|3. Es Jeruk       |");
        System.out.println("|4. Es Teh         |");
        System.out.println("+------------------+");

        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Menu [1-4]/0 untuk exit =");
        nomor_menu = input.nextInt();
        
        switch(nomor_menu) {
            case 1:
                System.out.println("Harga Rp. 13.000");
                break;
            case 2:
                System.out.println("Harga Rp. 19.000");
                break;
            case 3:
                System.out.println("Harga Rp. 4.000");
                break;
            case 4:
                System.out.println("Harga Rp. 2.000");
                break;
            default:
                System.out.println("Terima Kasih");
        }
    }   
}
