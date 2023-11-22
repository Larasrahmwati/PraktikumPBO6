package tabelperkalianwhile;

public class TabelPerkalianWhile {
    public static void main(String[] args) {
        int n = 4; 
        
        System.out.print("   ");
        int i = 1;
        while (i <= n) {
            System.out.print(i + "  ");
            i++;
        }
        System.out.println();

        i = 1;
        while (i <= n) {
            System.out.print(i + "  ");
            int j = 1;
            while (j <= n) {
                System.out.print((i * j) + "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
