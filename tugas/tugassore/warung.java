class warung {
    public static void main(String[] args) {

        minuman minuman1 = new minuman();
        minuman1.setData("Le Mineral", "1,5 Liter", "Tawar", "Bening");
        minuman minuman2 = new minuman();
        minuman2.setData("Fanta", "1,5 Liter", "Strawbery", "Merah");
        minuman minuman3 = new minuman();
        minuman3.setData("Sprite", "1,5 Liter", "Lemon & Lime", "Bening");
        minuman minuman4 = new minuman();
        minuman4.setData("BigCola", "1,5 Liter", "Cola", "Coklat");

        snack snack1 = new snack();
        snack1.setData("Taro", "Ciki Ciki", "Rumput Laut", "23000");
        snack snack2 = new snack();
        snack2.setData("Tango", "Wafer", "Coklat", "15000");
        snack snack3 = new snack();
        snack3.setData("Reches", "Wafer", "Keju", "1500");
        snack snack4 = new snack();
        snack4.setData("Rosta", "Kacang", "Bawang Panggang", "1000");
        snack snack5 = new snack();
        snack5.setData("Delfi", "Coklat", "Coklat", "23000");

        minuman[] daftarmMinuman = new minuman[4];
        daftarmMinuman[0] = minuman1;
        daftarmMinuman[1] = minuman2;
        daftarmMinuman[2] = minuman3;
        daftarmMinuman[3] = minuman4;

        snack[] daftarSnack = new snack [5];
        daftarSnack[0] = snack1;
        daftarSnack[1] = snack2;
        daftarSnack[2] = snack3;
        daftarSnack[3] = snack4;
        daftarSnack[4] = snack5;

        for (int i = 0; i <4; i++) {
            System.out.println("|----------------------------|");
            System.out.println("| Merek : " +daftarmMinuman[i].merek);
            System.out.println("| Kapasitas : " +daftarmMinuman[i].kapasitas );
            System.out.println("| Rasa : " +daftarmMinuman[i].rasa );
            System.out.println("| Warna : " + daftarmMinuman[i].warna );
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("|----------------------------|");
            System.out.println("| Merek : " +daftarSnack[i].merek );
            System.out.println("| Jenis : " + daftarSnack[i].jenis );
            System.out.println("| Harga : " + daftarSnack[i].harga );
            System.out.println("| Rasa : " + daftarSnack[i].rasa );
        }
        System.out.println( "|----------------------------|");

    }
}
  