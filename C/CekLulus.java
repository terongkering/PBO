import java.util.Scanner;

public class CekLulus {
    public static void main (String[] args) {
        int Nilai ;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Anda = ");
        Nilai = input.nextInt();

        if (Nilai >= 60 ) {
            System.out.println("Selamat Anda Lulus");
        }
        else {
            System.out.println("Maaf Anda Tidak Lulus");
        }
    }    
}
