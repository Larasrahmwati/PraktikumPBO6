package laguanakayamwhile;

public class LaguAnakAyamWhile {
    public static void main(String[] args) {
        int jumlahAyam = 5;

        System.out.println("Lagu Anak Ayam Turun " + jumlahAyam + " Menggunakan Perulangan While:");

        int i = jumlahAyam;
        while (i > 0) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            i--;
        }
    }
}

