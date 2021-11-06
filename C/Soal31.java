import javax.swing.JOptionPane;

class Soal31{
    public static void main(String[] args) {
        int a,b;
        double tambah, kurang, kali, bagi, pangkat;

        a = Integer.parseInt ( JOptionPane.showInputDialog( "Masukan Nilai a = "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai b = "));

        tambah = a + a;
        kurang = a - b;
        kali = a * b;
        bagi = a/b ;
        pangkat = Math.pow(a,b);

        JOptionPane.showMessageDialog(null, a + "+" + b + "=" + tambah);
        JOptionPane.showMessageDialog(null, a + "-" + b + "=" + kurang);
        JOptionPane.showMessageDialog(null, a + "*" + b + "=" + kali);
        JOptionPane.showMessageDialog(null, a + ":" + b + "=" + bagi);
        JOptionPane.showMessageDialog(null, a + "pangkat" + b + "=" + pangkat);

    }
}