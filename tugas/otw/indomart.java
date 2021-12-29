class indomart {
    public static void main(String[] args) {
        mie mie1 = new mie();
        mie1.setData("Bungkus", "Sambal Matah", "Indomie", "Goreng" , 3000);
        mie mie2 = new mie();
        mie2.setData("Cup", "Bakso", "Pop Mie", "Kuah", 10000);
        mie mie3 = new mie();
        mie3.setData("Bungkus", "Korean Spyce", "Indomie", "Goreng", 3000);
        mie mie4 = new mie();
        mie4.setData("Bungkus", "Samyang", "Indomie", "Kuah", 14000);

        mie[] daftarMie = new mie[4];
        daftarMie[0] = mie1;
        daftarMie[1] = mie2;
        daftarMie[2] = mie3;
        daftarMie[3] = mie4;

        for (int i = 0; i <4; i++) {
            System.out.println("Kemasan" + daftarMie[i].Kemasan);
            System.out.println("rasa" + daftarMie[i].rasa);
            System.out.println("merek" + daftarMie[i].merek);
            System.out.println("type" + daftarMie[i].type);
            System.out.println("harga" + daftarMie[i].harga);

        }
    }
}