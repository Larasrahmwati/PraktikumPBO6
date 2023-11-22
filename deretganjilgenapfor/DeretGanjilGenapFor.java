package deretganjilgenapfor;

public class DeretGanjilGenapFor {
    public static void main(String[] args) {
        System.out.println("Deret bilangan ganjil dan genap dari 0 - 20 menggunakan perulangan for:");

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Bilangan " + i + " Adalah Genap");
            } else {
                System.out.println("Bilangan " + i + " Adalah Ganjil");
            }
        }
    }
}

