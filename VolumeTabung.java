
import java.util.Scanner;

public class VolumeTabung {
    static double hitungVolume(double r, double t) {
        double volume = Math.PI * r * r * t;
        return volume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double jariJari = 0;
        double tinggi = 0;
        System.out.println("Menghitung volume tabung");
        System.out.print("Masukkan jari-jari tabung anda: ");
        jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung anda: ");
        tinggi = scanner.nextDouble();

        double hasil = hitungVolume(jariJari, tinggi);

        System.out.println("Volume tabung = " + hasil);
    }
}
