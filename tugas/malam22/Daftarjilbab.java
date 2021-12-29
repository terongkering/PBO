
public class Daftarjilbab {
        public static void main(String[] args) {

            Pegawai p1 = new Pegawai();
            p1.setData(1234, "Lisa", "Perempuan");
            p1.info();

            Dosen d1 = new Dosen();
            d1.setData("1234", "Mami", "Perempuan");

            Mahasiswa mahasiswa1 = new Mahasiswa();
            mahasiswa1.setData("Ani", "1234", "Z");
            mahasiswa1.dosenPa = d1;

            System.out.println("---");
            mahasiswa1.info();
            System.out.println(mahasiswa1.dosenPa.nama);
            System.out.println("---");

            Mahasiswa mahasiswa2 = new Mahasiswa();
            mahasiswa2.setData("Nina", "1235", "AA");
            mahasiswa2.dosenPa = d1;

            Jilbab jilbab1 = new Jilbab();
            jilbab1.setData("Navy", "Pasnina", "Katun", "Wadimor", 30000, 20, 30);
            jilbab1.pemilik = p1;

            Jilbab jilbab2 = new Jilbab();
            jilbab2.setData("Coksu", "Bargo", "Katun", "Wadimor", 45000, 30, 20);
            jilbab2.pemilik = mahasiswa1;

            Jilbab jilbab3 = new Jilbab();
            jilbab3.setData("Coksu", "Bargo", "Katun", "Wadimor", 45000, 30, 20);
            jilbab3.pemilik = d1;

            Jilbab[] daftarJilbab = new Jilbab[300];
            daftarJilbab[0] = jilbab1;
            daftarJilbab[1] = jilbab2;
            daftarJilbab[2] = jilbab3;

            for (int i = 0; i < 3; i++) {
                daftarJilbab[i].info();
                System.out.println("--------------------------------");
            }

        }
    

}
