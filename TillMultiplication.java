import java.util.*;
public class TillMultiplication {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] res = {1,1,1};
        int pro = 1;
        for(int i=0; i<arr.length; i++) {
            
                pro = pro * arr[i];
                arr[i] = pro;
                
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
