public class Task04 {
    public static void main(String ...args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        while (num1 <= 10){
            while (num2 <= 10){
                num3 = num2 * num1;
                System.out.print(num3 + " ");
                num2++;
            }
            num1++;
            System.out.println();
            num2=1;
        }
    }
}
