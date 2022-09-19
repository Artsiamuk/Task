public class Task03 {
    public static void main(String ...args) {
        int n = 16;
        if ((n >= 6) && (n < 12)) {
            System.out.println("Доброе утро!");
        } else if ((n >= 12) && (n < 18)) {
            System.out.println("Добрый день!");
        } else if ((n >= 18) && (n <= 23)) {
            System.out.println("Добрый вечер!");
        } else if (((n >= 0) && (n < 6)) || (n == 24)) {
            System.out.println("Доброй ночи!");
        } else {
            System.out.println("Введено некорректное время");
        }
    }
}
