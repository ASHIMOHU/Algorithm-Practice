import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), r = division(x, y);
        while (r != 0) {
            x = y;
            y = r;
            r = division(x, y);
            if (r == 0) {
                System.out.println(y + "が最大公約数です。");
            }
        }
    }

    public static int division(int x, int y) {
        int z = x % y;
        System.out.println(String.format("%d と %d を割った結果、余り %d が出力されました", x, y, z));
        return z;
    }
}
