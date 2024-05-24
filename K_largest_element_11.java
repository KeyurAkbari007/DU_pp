public class K_largest_element_11 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        int k = 4;
        int max = Integer.MIN_VALUE;
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
        System.out.println(arr[(arr.length - k) ]);
    }
}
