
import java.util.*;

public class MaxKeyHashMap {

    public static void main(String[] args) {
        HashMap<Integer, Integer> nhm = new HashMap<Integer, Integer>();
        nhm.put(1, 3);
        nhm.put(6, 5);
        nhm.put(2, 5);
        nhm.put(3, 4);
        nhm.put(4, 10);

        int k = 3;
        int index = 0;
        int arr[] = new int[k];
        
        
        for (int i = 0; i < k; i++) {
            int max = 0;
            int mkey = 0;

            for (Integer key : nhm.keySet()) {

                if (nhm.get(key) > max) {
                    max = nhm.get(key);
                    mkey = key;

                }

            }
            arr[index] = mkey;
            index++;
            nhm.remove(mkey);
        }


        System.out.println(Arrays.toString(arr));
    }
}
