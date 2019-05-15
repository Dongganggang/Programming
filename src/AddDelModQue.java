import java.util.Arrays;

public class AddDelModQue {
    public static int query(int []arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr.length == 0){
                return -1;
            }
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void add(int []arr, int value){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = value;
                break;
            }
        }
        Arrays.sort(arr);
    }

    public static void delete(int []arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                arr[i] = 0;
            }
        }
        Arrays.sort(arr);
    }

    public static void modify(int []arr, int value, int newvalue){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == value){
                arr[i] = newvalue;
                break;
            }
        }
        Arrays.sort(arr);
    }

    public static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,5,6,7,8,9,0};
        printArray(a);
        System.out.println("2 in array["+query(a, 2) + "]");
        add(a,4);
        System.out.println("after add 4 :");
        printArray(a);
        delete(a, 5);
        System.out.println("after delete 5:");
        printArray(a);
        modify(a, 9, 0);
        System.out.println("after modify 9 to 0");
        printArray(a);

    }


}
