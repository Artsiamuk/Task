public class Task04 {
    public static void main(String[] args) {
        int hour = 16;
        switch (hour) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 24:
                System.out.print("Доброй ночи");
                break;
            case 6: case 7: case 8: case 9: case 10: case 11:
                System.out.print("Доброе утро");
                break;
            case 12: case 13: case 14: case 15: case 16: case 17:
                System.out.print("Добрый день");
                break;
            case 18: case 19: case 20: case 21: case 22: case 23:
                System.out.print("Добрый вечер");
                break;
            default:
                System.out.print("Ошибка");
        }
    }
}

