// Kelas Mahasiswa
class Mahasiswa {
    String nim;
    String nama;
}

class Testing {
    public static void main(String[] args) {
        // membuat objek mahasiswa dengan nama objek anto
        Mahasiswa anto = new Mahasiswa();
        // mengisi atribut nim pada objek anto
        anto.nim = "180001";
        // mengisi atribut nama pada objek anto
        anto.nama = "Antonio";
        System.out.println("NIM " + anto.nim);
        System.out.println("Nama " + anto.nama);
        // membuat objek mahasiswa dengan nama objek ani
        Mahasiswa ani = new Mahasiswa();
        // mengisi atribut nim pada objek ani
        ani.nim = "180002";
        // mengisi atribut nama pada objek ani
        ani.nama = "Anita Wati";
        System.out.println("NIM " + ani.nim);
        System.out.println("Nama " + ani.nama);
    }
}
