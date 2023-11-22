package laguanakayamfor;

public class LaguAnakAyamFor {
    public static void main(String[] args) {
        int jumlahAyam = 5;

        System.out.println("Lagu Anak Ayam Turun " + jumlahAyam + " menggunakan perulangan for:");

        for (int i = jumlahAyam; i > 0; i--) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }
    }
}

