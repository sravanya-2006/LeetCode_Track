import java.util.*;
public class FreqOfIndex {
    public static void main(String[] args) {
        int[] arr = {7,8,7,6,8,7,5,6,5,7,6,7};

        HashMap<Integer,Integer> nhm = new HashMap<>();
        
        
        int freq = 0;
        for(int i=0; i<=arr.length-1; i++) {
            for(int j=0; j<=arr.length-1; j++) {
                if(arr[i] == arr[j]) {
                    freq++;
                }
            }
            nhm.put(arr[i],freq);
            System.out.println(nhm);
            freq = 0;
        }


    }
}
