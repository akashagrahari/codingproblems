/**
 * Created by akash on 28/9/18.
 */
public class StaircaseProblem {

    private static int count = 0;
    public static void main(String args[]) {
        int arr[] = {1,2,4};
        int goal = 4;
        countAllWays(arr, goal, 0, "");
        System.out.println(count);
    }

    private static void countAllWays(int[] arr, int goal, int currentValue, String currentState) {
        if (currentValue > goal) {
            return;
        }
        else if (currentValue == goal) {
            count++;
//            System.out.println();
            return;
        }
        else {
            for (int i=0; i< arr.length; i++) {
//                System.out.print(arr[i]);
                currentValue = currentValue + arr[i];
                countAllWays(arr,goal,currentValue, "");
                currentValue = 0;
            }
        }
    }


}
