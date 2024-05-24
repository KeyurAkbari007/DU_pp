import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders_in_array_8 {
    public static void findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();

        // Start from the last element
        int max_from_right = arr[n - 1];

        // The rightmost element is always a leader
        leaders.add(max_from_right);

        // Traverse the array from the second last element to the first element
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max_from_right) {
                leaders.add(arr[i]);
                max_from_right = arr[i];
            }
        }

        // Since we traversed from right to left, reverse the leaders list to maintain
        // order
        Collections.reverse(leaders);

        // Print the leaders
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 9, 3 };
        findLeaders(arr);
        // for (int i = 0; i < arr.length; i++) {
        // Boolean flag = true;
        // for (int j = i + 1; j < arr.length - 1; j++) {
        // if (arr[i] < arr[j]) {
        // flag = false;
        // break;
        // }

        // }
        // if (flag) {
        // System.out.println(arr[i]);
        // }
        // }
    }
}
