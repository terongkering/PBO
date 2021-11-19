class katalog {
    public static void main(String[] args) {
        Botol Botol1 = new Botol();
        Botol1.setData("Botol Keren", 125000, 85000, "Nalgene", 2, "Antimicrobial PU");
        Botol Botol2 = new Botol();
        Botol2.setData("Botol murah", 75000, 40000, "Dawson", 2, "HDPE, silicon");
        Handuk Handuk1 = new Handuk();
        Handuk1.setData("Chanel", 30, 300000, 120000, "Hitam");
        Handuk Handuk2 = new Handuk();
        Handuk2.setData("Ikea", 40, 450000, 200000, "Ungu");

        Botol[] daftarBotol = new Botol[2];
        daftarBotol[0] = Botol1;
        daftarBotol[1] = Botol2;
        Handuk[] daftarHanduk = new Handuk[2];
        daftarHanduk[0] = Handuk1;
        daftarHanduk[1] = Handuk2;

        for (int i = 0; i < 2; i++) {
            System.out.println("Nama Barang : " + daftarBotol[i].nama);
            System.out.println("Harga Barang : " + daftarBotol[i].hargajual);
            System.out.println("Laba : " + daftarBotol[i].laba());
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Nama Barang : " + daftarHanduk[i].merek);
            System.out.println("Harga Barang : " + daftarHanduk[i].hargajual);
            System.out.println("Laba : " + daftarHanduk[i].laba());
        }
    }
}
