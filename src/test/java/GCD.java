import java.util.Arrays;

public class GCD {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 10;
        num2 = 15;
        System.out.println(Arrays.toString(gcdlcm(num1, num2)));
    }

    public static int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int number1, number2;
        int remain = 1;

        if (a > b) {
            number1 = a;
            number2 = b;
        } else {
            number1 = b;
            number2 = a;
        }
        while (remain > 0) { // 유클리드 호제법
            remain = number1 % number2;
            number1 = number2;
            number2 = remain;
        }
        answer[0] = number1;//최대공약수
        answer[1] = a * b / number1;//최소공배수

        return answer;
    }
}
