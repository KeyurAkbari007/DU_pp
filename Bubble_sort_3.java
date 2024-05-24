import java.util.Scanner;

public class Bubble_sort_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Boolean flag =true;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

    }
}
