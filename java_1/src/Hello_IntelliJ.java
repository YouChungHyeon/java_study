public class Hello_IntelliJ {

    public static void main(String[] arg) {

        int num1 = 5, num2 = 3;
        System.out.println(num1 + "의" + num2 + "승은 " + func(num1, num2));
    }

    private static int func(int num1, int num2) {

        if(num2 == 0) {
            return 1;
        } else {
            return num1 * func(num1, num2 - 1);
        }
    }
}
