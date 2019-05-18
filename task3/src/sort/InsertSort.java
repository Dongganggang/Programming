package sort;

public class InsertSort {
    public static void sort(int [] array){
        int target;
        for(int i = 1; i < array.length; i++){
            int j = i; //当前被排序的元素
            target = array[i];

            while(j > 0 && target < array[j - 1]){ //没找到头并且当前元素比前一元素小
                array[j] = array[j - 1];
                j--;
            }
            array[j] = target;
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
