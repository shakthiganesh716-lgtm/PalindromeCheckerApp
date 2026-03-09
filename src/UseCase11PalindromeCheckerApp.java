public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeService service = new PalindromeService();

        if (service.checkPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

    }
}