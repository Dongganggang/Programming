package recursive;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void noRepeat(int[] arr, int n) {

        int length = arr.length;
        if (n >= length - 1) { //递归出口
            for (int i :
                    arr) {
                System.out.print(i);
            }
            System.out.println();
        } else {
            for (int i = n; i < length; i++) {

                int temp1 = arr[n];
                arr[n] = arr[i];
                arr[i] = temp1;

                noRepeat(arr, n + 1);

                int temp2 = arr[n];
                arr[n] = arr[i];
                arr[i] = temp2;
            }
        }
    }

    public static void hasRepeat(int[] arr, int n) {
        int length = arr.length;
        List<Integer> exis = new ArrayList<>(); //存放重复数字
        if (n >= length - 1) { //递归出口
            for (int i :
                    arr) {
                System.out.print(i);
            }
            System.out.println();
        } else {
            for (int i = n; i < length; i++) {
                if (!exis.contains(arr[i])) {
                    exis.add(arr[i]);

                    int temp1 = arr[n];
                    arr[n] = arr[i];
                    arr[i] = temp1;

                    hasRepeat(arr, n + 1);

                    int temp2 = arr[n];
                    arr[n] = arr[i];
                    arr[i] = temp2;

                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        noRepeat(a, 0);

        int[] b = {1, 2, 3, 2};
        hasRepeat(b, 0);

    }
}
