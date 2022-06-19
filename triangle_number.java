
// Задача - написать программу вычисления n-ого треугольного числа Tn=1/2n(n+1), n = 1,2,3
/**
 * triangle_number
 */
import java.util.Scanner;

public class triangle_number {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        int userNum = iScanner.nextInt();
        int triangNum = TriangNum(userNum);
        System.out.printf("%d треугольное число равняется %d", userNum, triangNum);

        iScanner.close();
    }

    static int TriangNum(int n) {
        double a = 0.5 * n * (n + 1);
        int result = (int) a;
        return result;
    }
}