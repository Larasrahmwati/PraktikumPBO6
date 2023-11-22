package deretganjilgenapdowhile;

public class DeretGanjilGenapDoWhile {
    public static void main(String[] args) {
        System.out.println("Deret bilangan ganjil dan genap dari 0 - 20 menggunakan perulangan Do While:");

        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println("Bilangan " + i + " Adalah Genap");
            } else {
                System.out.println("Bilangan " + i + " Adalah Ganjil");
            }
            i++;
        } while (i <= 20);
    }
}

