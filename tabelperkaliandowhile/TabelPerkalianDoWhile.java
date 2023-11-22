package tabelperkaliandowhile;

public class TabelPerkalianDoWhile {
    public static void main(String[] args) {
        int n = 4; 
        
        System.out.print("   ");
        int i = 1;
        do {
            System.out.print(i + "  ");
            i++;
        } while (i <= n);
        System.out.println();

        i = 1;
        
        do {
            System.out.print(i + "  ");
            int j = 1;
            do {
                System.out.print((i * j) + "  ");
                j++;
            } while (j <= n);
            System.out.println();
            i++;
        } while (i <= n);
    }
}

