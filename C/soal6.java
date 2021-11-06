import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class soal6 {
    public static void main(String[] args) {
        int data;
    int perulangan = 0, jumlah = 0;
    double rata2;

    do {
    
        // input data selanjutnya  
        String strData = JOptionPane.showInputDialog(null,
            "Masukkan nilai siswa (integer)" +
            "\nInput program berakhir jika nilai input 0", "Nilai Siswa",
            JOptionPane.QUESTION_MESSAGE);

        data = Integer.parseInt(strData);
        jumlah += data;
        if (data != 0)
            perulangan += 1;
        } while (data != 0);

    DecimalFormat duaAngka = new DecimalFormat("0.00");

    rata2 = (double) jumlah / perulangan;

    JOptionPane.showMessageDialog(null, "Jumlah nilai dinput : " + perulangan +
        "\nTotal nilai diinput : " + jumlah + "\nNilai rata-rata : " +
        duaAngka.format(rata2), "Nilai Rata-rata", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}