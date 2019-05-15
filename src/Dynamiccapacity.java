//
////数组
//
////1.数组动态扩容
//
////1.1System.arraycopy(原数组名，起始下标，新数组名，起始下标，复制长度);
//public class Dynamiccapacity {
//
//    static public int[] array = new int[20];
//
//    public static void main(String[] args) {
//        array = addLengthArray(array);
//        for (int i = 0; i < array.length; i++){
//            array[i] = i;
//            System.out.println(array[i]);
//        }
//
//    }
//
//    public static int[] addLengthArray(int [] array){
//        int[] newArray = new  int [array.length * 2];
//        System.arraycopy(array, 0, newArray, 0, array.length);
//        //array[0] -> newArray[0] copy array.length
//        return newArray;
//    }
//}
//
//import java.util.Arrays;
//
////1.2java.util.Arrays.copyOf(原数组名，新数组长度)
//public class Dynamiccapacity {
//    public static void main(String[] args) {
//        int[] arr1 = new int[20];
//        int[] arr2 = Arrays.copyOf(arr1, arr1.length * 2);
//        for(int i = 0; i < arr2.length; i++){
//            arr2[i] = i;
//            System.out.println(arr2[i]);
//        }
//    }
//}


//1.3 arrlong[i] = arrshort[i];

public class Dynamiccapacity {
    public static void main(String[] args) {
        int[] arr1 = new int[20];
        int[] arr2 = new int[arr1.length * 2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 0;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + " ]" + arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[ " + i + " ]" + arr2[i]);
        }
    }
}