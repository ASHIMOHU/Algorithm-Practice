import java.util.Scanner;

public class PartialSum {
    static int a[];
    static int n, k;

    // iまででsumを作って、残りi以降を調べる
    static boolean dfs(int i, int sum) {
        // n個決め終わったら、今までの和sumがkと等しいかを返す。
        if (i == n) {
            return sum == k;
        }
        // a[i]を使わない場合
        if (dfs(i + 1, sum)) {
            return true;
        }

        // a[i]をを使う場合
        if (dfs(i + 1, sum + a[i])) {
            return true;
        }

        return false;
    }

    static void solve() {
        if (dfs(0, 0)) {
            System.out.println("Yes\n");
        } else {
            System.out.println("No\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("k = ");
        k = sc.nextInt();
        solve();
    }
}
