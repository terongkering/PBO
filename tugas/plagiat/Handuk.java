public class Handuk {
    String merek;
    double ukuranhanduk;
    double hargajual;
    double hargamodal;
    String warna;

    public double laba() {
        return this.hargajual - this.hargamodal;
    }

    public void setData(String merek, double ukuranlensa, double hargajual, double hargamodal, String warna) {
        this.merek = merek;
        this.ukuranhanduk = ukuranlensa;
        this.hargajual = hargajual;
        this.hargamodal = hargamodal;
        this.warna = warna;
    }
}
