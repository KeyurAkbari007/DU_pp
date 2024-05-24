public class Selection_sort_1 {

    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 1, 7 };

        for (int i = 0; i < arr.length - 1; i++) {
            int minj = i;
            int minx = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minx) {
                    minj = j;
                    minx = arr[j];
                }
            }
            arr[minj] = arr[i];
            arr[i] = minx;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
    }
}