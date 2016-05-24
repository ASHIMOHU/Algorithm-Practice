import java.util.Scanner;

public class Triangle {
    static int n;
    static int a[] = new int[5];

    static void slove() {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int len = a[i] + a[j] + a[k];                   // 周長
                    int ma = Math.max(a[i], Math.max(a[j], a[k]));  // 最も長い棒の長さ
                    int rest = len - ma;                            // 他の2本の棒の長さの和

                    if (ma < rest) {
                        // 三角形が作れるので、答えを更新できれば更新
                        ans = Math.max(ans, len);
                    }
                }
            }
        }
        System.out.println(String.format("%d\n",ans));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        slove();
    }
}
