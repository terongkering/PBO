import java.util.Scanner;
public class uts1 {
   
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        float phi = 3.14f;
        float r, tinggi, s;  // s = Panjang Garis Pelukis
        float luasP, volume;
 
        System.out.println("\t Hitung Luas Permukaan dan Volume Kerucut \n\n");
 
        System.out.print(" Masukkan Jari-jari     : ");
        r = userInput.nextFloat();
       
        System.out.print(" Masukkan Tinggi        : ");
        tinggi = userInput.nextFloat();
 
        System.out.print(" Masukkan Panjang Garis : ");
        s = userInput.nextFloat();
 
        luasP = phi * r * (r + s);
        System.out.println("\n Luas Permukaannya : " + luasP);
 
    }
    public static float LuasPermukaan(float r, float s) {
        float phi = 3.14f;
        float hasil = phi*r*(r+s);
        return hasil;
    }
}