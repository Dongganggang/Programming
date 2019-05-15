package recursive;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        System.out.println(n + "的阶乘为：" + s);
    }
}
