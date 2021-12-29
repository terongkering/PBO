

public class Pegawai extends Manusia {
    int nip;

    void setData(int nip, String nama, String jenisKelamin) {
        this.nip = nip;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    void info() {
        System.out.println("NIP " + this.nip);
        System.out.println("Nama " + this.nama);
        System.out.println("Jenis Kelamin " + this.jenisKelamin);
    }
}
