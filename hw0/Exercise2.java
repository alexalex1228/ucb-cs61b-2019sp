/**
 * now create a function with the signature (public static int max(int[] m) that returns the maximum value of an int array.
 *  You may assume that all of the numbers are greater than or equal to zero.
 * */
public class Exercise2 {
    /**
     * @param m the array
     * */
    public static int max(int[] m){
        int length= m.length;
        int max= m[0];
        for(int i=1;i<length;++i) {
            if(max<m[i]) max= m[i];
        }
        return max;
    }
}
