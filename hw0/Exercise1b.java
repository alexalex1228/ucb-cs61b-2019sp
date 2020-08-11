import java.util.Scanner;

/**
 * Name this new method drawTriangle and give it a return type of void (this means that it doesn’t return anything at all).
 * The drawTriangle method should take one parameter named N,
 * and it should print out a triangle exactly like your triangle from exercise 1a, but N asterisks tall instead of 5.
 * */
public class Exercise1b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        DrawTriangle(number);
    }
    /**
     * @param N the number to be loop
     * */
    public static void DrawTriangle(int N) {
        for(int i=0;i<N;++i) {
            for(int j=0;j<i+1;++j) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
