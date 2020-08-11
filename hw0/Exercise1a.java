/**
 * @author xiateng
 *Your goal is to create a program that prints the following figure. Your code should use loops
 * (i.e. shouldn’t just be five print statements, that’s no fun).
 * */
public class Exercise1a {
    public static void main(String[] args) {
        int index= 5;
        for(int i=1;i<=index;++i){
            for(int j=0;j<i;++j) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
