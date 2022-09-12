public class Task03 {
    public static void main(String ...args) {
        int n = 18;
        if (n > 4 && n < 12) {
            System.out.println("Good morning!");
        } else if (n > 11 && n < 18) {
            System.out.println("Good day!");
        } else if (n > 17 && n <= 24) {
            System.out.println("Good evening!");
        } else if (n < 5 && n > 0) {
            System.out.println("Good night!");
        }
    }
}
