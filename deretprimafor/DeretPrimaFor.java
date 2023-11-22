package deretprimafor;

public class DeretPrimaFor {
    public static void main(String[] args) {
        System.out.println("Deret bilangan prima dan bukan dari 0 - 20 menggunakan for:");

        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.println("Bilangan " + i + " Adalah Prima");
            } else {
                System.out.println("Bilangan " + i  + " Bukan Prima");
            }
        }
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
