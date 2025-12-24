import java.util.*;
public class GetOrDefault {
    public static void main(String[] args) {
        int[] arr = {7,8,7,6,8,7,5,6,5,7,6,7};

        HashMap<Integer,Integer> nhm = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            nhm.put(arr[i], nhm.getOrDefault(arr[i], 0)+1);
        }   

        System.out.println(nhm);




    }
}
