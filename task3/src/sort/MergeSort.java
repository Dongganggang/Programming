package sort;

public class MergeSort {
    public static void sort(int[] array, int left, int mid, int right) {
        int[] temp = new int[array.length];
        int i = left, j = mid;
        int k = left;

        while (i < mid + 1 && j < right +1) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i < mid + 1) {
            temp[k++] = array[i++];
        }
        while (j < right + 1) {
            temp[k++] = array[j++];
        }

        for (int l = left; l <= right; l++) {
            array[l] = temp[l];
        }
    }

    public static void merge(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge(a, left, mid); //左边拆分
            merge(a, mid + 1, right); //右边拆分
            sort(a, left, mid, right); //合并
        }
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
        merge(a, 0, a.length - 1);
        System.out.println("排序后：");
        printArray(a);
    }
}