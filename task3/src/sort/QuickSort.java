package sort;

public class QuickSort {
    public static int[] sort(int[] array, int left, int right) {
        if (left > right)
            return null;

        int l_index, r_index, temp;
        l_index = left; //左哨兵
        r_index = right;//右哨兵
        temp = array[left]; //基准

        while (l_index < r_index) {
            /**
             * 定义一个基准
             * 从右往左找小的
             * 从左往右找大的
             * 交换位置
             */
            while (array[r_index] >= temp && r_index > l_index) {
                r_index--;
            }

            while (array[l_index] <= temp && l_index < r_index) {
                l_index++;
            }

            int t = array[l_index];
            array[l_index] = array[r_index];
            array[r_index] = t;

        }
        //l_index == r_index即找到基准的位置
        array[left] = array[l_index];
        array[l_index] = temp;

        sort(array, left, r_index - 1);
        sort(array, r_index + 1, right);

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 2, 4, 1, 9, 5, 2};
        System.out.println("排序前：");
        printArray(a);
        sort(a, 0, a.length - 1);
        System.out.println("排序后：");
        printArray(a);
    }
}
