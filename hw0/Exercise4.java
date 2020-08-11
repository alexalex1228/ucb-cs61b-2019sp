import java.util.Arrays;

/**
 * Write a function windowPosSum(int[] a, int n) that replaces each element a[i] with the sum of a[i] through a[i + n],
 * but only if a[i] is positive valued. If there are not enough values because we reach the end of the array,
 * we sum only as many values as we have.
 * */
public class Exercise4 {
    public static void windowPosSum(int[] a, int n) {
        int length= a.length;
        for(int i=0;i<length;++i) {
            if(a[i]>0) {
                int result= 0;
                for(int j=i;j<Math.min(length,i+n+1);++j) {
                    result+=a[j];
                }
                a[i]= result;
            }
        }
    }

    public static void main(String[] args) {
        int[] array= new int[]{1,2,-3,4,5,4};
        int n=3;
        windowPosSum(array, 3);
        System.out.println(Arrays.toString(array));
    }
}

