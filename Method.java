

public class Method {
    int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    int diff(int a, int b) {
        int c = a - b;
        return c;
    }

    int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    int divide(int a, int b) {
        int c = a / b;
        return c;
    }

    int pattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        int a1 = 20;
        int b1 = 10;
        int result_1;
        int result_2;
        int result_3;
        int result_4;
        int result_5;

        Method obj = new Method();
        result_1 = obj.sum(a1, b1);
        result_2 = obj.diff(a1, b1);
        result_3 = obj.multiply(a1, b1);
        result_4 = obj.divide(a1, b1);
        result_5 = obj.pattern();
        System.out.println("Sum is : " + result_1);
        System.out.println("Difference is :" + result_2);
        System.out.println("Multiplication is :" + result_3);
        System.out.println("Divide is :" + result_4);
        System.out.println("Pattern is :" + result_5);
    }
}
