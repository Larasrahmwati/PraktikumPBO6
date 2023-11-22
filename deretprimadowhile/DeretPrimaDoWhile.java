package deretprimadowhile;

public class DeretPrimaDoWhile {
    public static void main(String[] args) {
        System.out.println("Deret bilangan prima dan bukan dari 0 - 20 menggunakan do while:");

        int i = 0;
        do {
            if (isPrima(i)) {
                System.out.println("Bilangan " + i + " Adalah Prima");
            } else {
                System.out.println("Bilangan " + i + " Bukan Prima");
            }
            i++;
        } while (i <= 20);
    }

    private static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


