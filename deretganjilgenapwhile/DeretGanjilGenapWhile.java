package deretganjilgenapwhile;

public class DeretGanjilGenapWhile {
    public static void main(String[] args) {
        System.out.println("Deret bilangan ganjil dan genap dari 0 - 20 menggunakan perulangan  while:");

        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println("Bilangan " + i + " Adalah Genap");
            } else {
                System.out.println("Bilangan " + i + " Adalah Ganjil");
            }
            i++;
        }
    }
}

