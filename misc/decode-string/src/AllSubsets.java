import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by akash on 27/9/18.
 */
public class AllSubsets {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of set");
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter elements of set");
        int arr[] = new int[n];
        for (int i=0; i< n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        String subset = "";
        printAllSubsets(arr, 0, subset);
    }

    private static void printAllSubsets(int[] arr, int i, String subset) {
        if(i==arr.length) {
            if(subset.equals("")) {
                System.out.println("_");
            }
            else {
                System.out.println(subset);
            }
            return;
        }
        printAllSubsets(arr, i+1, subset+arr[i]);
        printAllSubsets(arr, i+1, subset);
    }
}
