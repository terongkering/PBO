class katalogjualan {
	public static void main(String[] args) {
		Sendal sendal1 = new Sendal();
		sendal1.setData("Sendal Keren", 125000, 85000, "Carvil", 42, "Kulit");
		Sendal sendal2 = new Sendal();
		sendal2.setData("Sendal murah", 75000, 40000, "swallow", 42, "karet");
		Kacamata kacamata1 = new Kacamata();
		kacamata1.setData("Chanel", 30, 300000, 120000, "Hitam");
		Kacamata kacamata2 = new Kacamata();
		kacamata2.setData("oackley", 40, 450000, 200000, "Ungu");

		Sendal[] daftarsendal = new Sendal[2];
		daftarsendal[0] = sendal1;
		daftarsendal[1] = sendal2;
		Kacamata[] daftarkacamata = new Kacamata[2];
		daftarkacamata[0] = kacamata1;
		daftarkacamata[1] = kacamata2;

		for(int i = 0; i < 2; i ++) {
			System.out.println("Nama Barang : " + daftarsendal[i].nama);
			System.out.println("Harga Barang : " + daftarsendal[i].hargajual);
			System.out.println("Laba : " + daftarsendal[i].laba());
		}

		for(int i = 0; i < 2; i ++) {
			System.out.println("Nama Barang : " + daftarkacamata[i].merek);
			System.out.println("Harga Barang : " + daftarkacamata[i].hargajual);
			System.out.println("Laba : " + daftarkacamata[i].laba());
		}
	}
}