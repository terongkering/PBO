
public class Jilbab {
    String warna;
    String model;
    String jenisKain;
    String merek;
    double harga;
    double panjang;
    double lebar;
    Manusia pemilik;

    void setData(String warna, String model, String jenisKain, String merek, double harga, double panjang,
            double lebar) {
        this.warna = warna;
        this.model = model;
        this.jenisKain = jenisKain;
        this.merek = merek;
        this.harga = harga;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void info() {
        System.out.println("Pemilik " + pemilik.nama);
        System.out.println("Warna " + this.warna);
        System.out.println("Model " + this.model);
        System.out.println("Jenis Kain " + this.jenisKain);
        System.out.println("harga " + this.harga);
        System.out.println("panjang " + this.panjang);
        System.out.println("lebar " + this.lebar);

    }
}
