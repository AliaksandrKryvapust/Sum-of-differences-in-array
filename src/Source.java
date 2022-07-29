import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 1, 1, 1, 1};
        System.out.println(sumOfDifferences(arr)==0);
    }
    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
    }
}
