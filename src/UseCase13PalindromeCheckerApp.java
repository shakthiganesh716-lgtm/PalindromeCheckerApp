public class UseCase13PalindromeCheckerApp {

    static boolean method1(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    static boolean method2(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        long start1 = System.nanoTime();
        boolean result1 = method1(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = method2(word);
        long end2 = System.nanoTime();

        System.out.println("Method 1 Result: " + result1);
        System.out.println("Method 1 Time: " + (end1 - start1) + " ns");

        System.out.println("Method 2 Result: " + result2);
        System.out.println("Method 2 Time: " + (end2 - start2) + " ns");
    }
}