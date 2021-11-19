public class Sendal {
	String nama;
	int ukuran;
	double hargajual;
	double hargamodal;
	String merek;
	String bahan;

	public double laba() {
		return this.hargajual - this.hargamodal;
	}

	public void setData (String nama, 
		double hargajual, double hargamodal, String merek, int ukuran, String bahan) {
		this.nama = nama;
		this.hargajual = hargajual;
		this.hargamodal = hargamodal;
		this.merek = merek;
		this.ukuran = ukuran;
		this.bahan = bahan;
	}
}

