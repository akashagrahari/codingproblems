import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by akash on 27/9/18.
 */
public class SetOfNumbersWithSum {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter goal sum");
        int sum = Integer.parseInt(bufferedReader.readLine());
        System.out.println(("Enter size of array"));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println(countAllValidSubsets(arr, sum, 0));
    }

    private static int countAllValidSubsets(int[] arr, int sum, int i) {
        if (sum == 0) {
            return 1;
        }
        else if (sum < 0) {
            return 0;
        }
        else if (i>=arr.length) {
            return 0;
        }
        else if (sum < arr[i]) {
            return countAllValidSubsets(arr, sum, i+1);
        }
        else {
            return  countAllValidSubsets(arr, sum-arr[i], i+1 ) +
                    countAllValidSubsets(arr, sum, i+1);
        }
    }
}
