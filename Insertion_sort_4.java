import java.util.Scanner;

public class Insertion_sort_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int x = arr[i];
            while (j >= 0 && x < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
