public class Reverse_string_words_10 {
    public static void main(String[] args) {
        String str = "I am a good boy";
        String[] arr = str.split(" ");
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i] + " ";
        }
        System.out.println(res);
    }
}
