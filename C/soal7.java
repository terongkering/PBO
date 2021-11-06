import javax.swing.JOptionPane;

public class soal7{

    public static void main(String[] args) {

        int jumlah = 0, i = 2;

        while(true){
            String angka = JOptionPane.showInputDialog("Masukkan Angka : ");
            System.out.println ("Angka ke-" + i + " = " + angka);
            i++;
            
            if(Integer.parseInt(angka) % 2 == 0 ) {
                jumlah = jumlah + Integer.parseInt(angka);
            }
            if (Integer.parseInt(angka) == 0 ){
                break;
            }
        }
        System.out.println();
        System.out.println("Penjumlahan Himpunan (Hanya Kelipatan 4)= " + jumlah);
    
    }
}
