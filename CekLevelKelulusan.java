import java.util.Scanner;

public class CekLevelKelulusan {
    public static void main(String[] args) {
        int nilai;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Anda = ");
        nilai = input.nextInt();

        if (nilai >= 80) {
            System.out.println("Nilai Anda Sangat Baik");
        }   else if (nilai >= 70) {
            System.out.println("Nilai Anda Baik");    
        }   else if (nilai >= 60) {
            System.out.println("Nilai Anda Cukup");
        }   else {
            System.out.println("Nilai Anda Kurang");
        }
    } 
}
