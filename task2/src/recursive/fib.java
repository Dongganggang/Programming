package recursive;

public class fib {
    static int fibacc(int a, int b, int n) {
        if(n > 2){
            return fibacc(a+b, a, n-1);
        }
        return a;

    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(fibacc(1,1, i) + "\t");
        }
    }
}
