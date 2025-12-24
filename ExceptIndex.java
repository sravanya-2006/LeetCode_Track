import java.util.*;
public class ExceptIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] rev = {1,1,1,1,1};
        for(int i=0; i<rev.length-1; i++) {
            int product = 1;
            for(int j=0; j<arr.length-1; j++) {
                if(i!=j){
                    product = product * arr[j];
                }
                rev[i] = product;
            }
        }
        System.out.print(Arrays.toString(rev));
    }
}
