
import java.util.Scanner;

public class soal2 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String NIM;
        String NAMA;
        String KELAS;

        System.out.println("INPUT NAMA = ");
        NAMA=scan.nextLine();
        System.out.println("INPUT NIM = ");
        NIM=scan.nextLine();
        System.out.println("INPUT KELAS = ");
        KELAS=scan.nextLine();
        
        System.out.println("NAMA SAYA = " +NAMA);
        System.out.println("NIM SAYA = " +NIM);
        System.out.println("KELAS SAYA = " +KELAS);

    }
}

