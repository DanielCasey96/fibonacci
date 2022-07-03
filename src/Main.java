public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.fib(29);
    }
    public int fib(int n) {
        if(n==0) {
            return 0;
        }
        int old = 1;
        int extraOld = 0;
        int current = 1;
        for(int k = 2; k<=n; k++) {
            current = extraOld + old;
            extraOld = old;
            old = current;
        }
        return current;
    }
}
