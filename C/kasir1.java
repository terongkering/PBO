import java.util.Scanner;

public class kasir1
{
    public static void main(String[] args)
    {
//        inisialisasi java library scanner
        Scanner scan = new Scanner(System.in);
//        menampilkan menu makanan
        System.out.println(" ____________________________________");
        System.out.println("|            MENU MAKANAN            |");
        System.out.println("|____________________________________|");
        System.out.println("|o Nama            |  Harga          |");
        System.out.println("|1. Nasi Goreng    |   Rp 10000,00   |");
        System.out.println("|2. Nasi Campur    |   Rp 8000,00    |");
        System.out.println("|3. Ayam Goreng    |   Rp 15000,00   |");
        System.out.println("|4. Es Teh         |   Rp 4000,00    |");
        System.out.println("|5. Es Kelapa Muda |   Rp 5000,00    |");
        System.out.println("|__________________|_________________|");
        System.out.println("");

//        inisialisasi pembayaran awal
        int harga = 0;
//        inisialisasi harga ketiga menu
        int h1 = 10000, h2 = 8000, h3 = 15000, h4 = 4000, h5 = 5000;
        String menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("_____________________________________");
//        pengguna memasukkan nomor pesanan
        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor = scan.nextInt();
        System.out.print("Masukkan Banyak Pesanan : ");
        int jumlah = scan.nextInt();
        System.out.println("_____________________________________");

        if (inNomor == 1)
        {
//            jika nomor satu, maka menu yang dipilih adalah batagor, dan harganya adalah h1, yang merupakan harga menu pertama
            menu = " Nasi Goreng";
            System.out.println("Pilihan anda nomor " +inNomor + menu);
            harga = harga + h1 * jumlah;
        }
            else if (inNomor == 2)
            {
//            jika nomor dua, maka menu yang dipilih adalah kupat tahu, dan harganya adalah h2, yang merupakan harga menu kedua
                menu = " Nasi Campur";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h2 * jumlah;
            }
                else if (inNomor == 3)
                {
//            jika nomor tiga, maka menu yang dipilih adalah lontong kari, dan harganya adalah h3, yang merupakan harga menu ketiga
                    menu = " Ayam Goreng";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h3 * jumlah;
                }
                    else if (inNomor == 4)
                    {
//            jika nomor tiga, maka menu yang dipilih adalah lontong kari, dan harganya adalah h3, yang merupakan harga menu ketiga
                        menu = " Es Teh";
                        System.out.println("Pilihan anda nomor " +inNomor + menu);
                        harga = harga + h4 * jumlah;
                    }
                        else if (inNomor == 5)
                        {
//            jika nomor tiga, maka menu yang dipilih adalah lontong kari, dan harganya adalah h3, yang merupakan harga menu ketiga
                            menu = " Es Kelapa Muda";
                            System.out.println("Pilihan anda nomor " +inNomor + menu);
                            harga = harga + h5 * jumlah;
                        }
                     else
//            jika selain nomor satu sampai tiga, maka akan ditampilkan "Nomor yang dipilih tidak ada di menu."
                    {
                        System.out.println("Nomor yang dipilih tidak ada di menu.");
                    }

//            User diperintahkan untuk memasukkan data apakah dia akan melanjutkan atau tidak
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();

        }
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar " +harga+".");
        System.out.println("Terimakasih atas kunjungannya.");
    }
}