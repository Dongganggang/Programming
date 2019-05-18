package sort;

public class SelectionSort {
    public static void sort(int [] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] a = {3,5,2,4,1,9,5,2};
        System.out.println("排序前：");
        printArray(a);
        sort(a);
        System.out.println("排序后：");
        printArray(a);
    }
}
