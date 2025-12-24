
import java.util.Arrays;


public class ExcludeMultiplication {
    public static void main(String[] args) {
        int arr[] = {2,4,3,10};
        int res[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            res[i] = 1;
        }

        for(int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr.length; j ++) {
                if ( i != j)
                    res[i] = res[i] * arr[j];
            }
        }

        System.out.println(Arrays.toString(res));
    }                                                                                                       
}