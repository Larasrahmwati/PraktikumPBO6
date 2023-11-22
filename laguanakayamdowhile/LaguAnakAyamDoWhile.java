package laguanakayamdowhile;

public class LaguAnakAyamDoWhile {
    public static void main(String[] args) {
        int jumlahAyam = 5;

        System.out.println("Lagu Anak Ayam Turun " + jumlahAyam + " Menggunakan Perulangan Do While:");

        int i = jumlahAyam;
        do {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            i--;
        } while (i > 0);
    }
}
