import java.util.Arrays;

public class AscDesProductArray {
    public static void main(String[] args) {
        int[] arr = {10,2,3,5};
        int[] res = new int[arr.length];
        int pro = 1;
        int product = 1;
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            product = product*arr[i];
            res[count] = product;
            count++;
        }
        for(int i=arr.length-1; i>=0; i--) {
            pro = pro*arr[i];
            arr[i] = pro;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));

    }
}
