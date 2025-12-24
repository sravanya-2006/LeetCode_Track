import java.util.*;

public class TwoIntegerSum {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
       int res[] = new int[2];
       int count = 0;
       Arrays.sort(arr);
       int target = 5;
        
       int i = 0;
       int j = arr.length - 1;

       while(i < j) {

            
            int sum = arr[i] + arr[j];

            if(sum == target) {
                System.out.println(arr[i] + " " + arr[j]);
                break;
            }

            if(sum > target) {
                j--;
                continue;
            }

            if(sum < target) {
                i++;
                continue;
            }

            i++;
            j--;

       }
    }
}
