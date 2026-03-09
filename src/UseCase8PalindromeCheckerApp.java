class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    static Node head = null;

    // Insert node
    static void insert(char data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Check palindrome
    static boolean isPalindrome(String word) {

        for (int i = 0; i < word.length(); i++) {
            insert(word.charAt(i));
        }

        String forward = "";
        String reverse = "";

        Node temp = head;

        while (temp != null) {
            forward = forward + temp.data;
            temp = temp.next;
        }

        for (int i = forward.length() - 1; i >= 0; i--) {
            reverse = reverse + forward.charAt(i);
        }

        return forward.equals(reverse);
    }

    public static void main(String[] args) {

        String word = "madam";

        if (isPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

    }
}
