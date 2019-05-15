public class MergeArray {
    public static int[] merge1(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return new int[1];
        }
        int merge[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < merge.length; i++) {
            if (i >= 0 && i < arr1.length) {
                merge[i] = arr1[i];
            } else {
                merge[i] = arr2[i - arr1.length];
            }
        }
        return merge;
    }

    public static int[] merge2(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return new int[1];
        }
        int merge[] = new int[arr1.length + arr2.length];
        int a1 = 0, a2 = 0;
        for (int i = 0; i < merge.length; i++) {
            if (arr1.length == a1) {
                merge[i] = arr2[a2];
                a2++;
            } else if (arr2.length == a2) {
                merge[i] = arr1[a1];
                a1++;
            } else {
                if (arr1[a1] > arr2[a2]) {
                    merge[i] = arr2[a2];
                    a2++;
                } else {
                    merge[i] = arr1[a1];
                    a1++;
                }
            }
        }
        return merge;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {0, 2, 4, 6, 8};
        System.out.println("merge1:");
        printArray(merge1(arr1, arr2));
        System.out.println("merge2:");
        printArray(merge2(arr1, arr2));

    }
}

