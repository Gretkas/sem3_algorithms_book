package chapterTwo;

public class Fibonacci {
    private int linearFib(int a, int b, int n) {
        if (n == 0) {
            return a+b;
        }
        return linearFib(b,a+b,n-1);
    }
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.linearFib(0,1,5));
    }
}
