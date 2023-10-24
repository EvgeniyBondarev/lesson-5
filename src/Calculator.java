import java.util.Scanner;

public class Calculator {
    static void addition(int num1, int num2){
        System.out.printf("Сумма %d и %d равна %d", num1, num2, (num1 + num2));
    }
    static void subtraction(int num1, int num2){
        System.out.printf("Разность %d и %d равна %d", num1, num2, (num1 - num2));
    }
    static void multiplication(int num1, int num2){
        System.out.printf("Произведение %d и %d равно %d", num1, num2, (num1 * num2));
    }
    static void division(int num1, int num2){
        System.out.printf("Частное %d и %d равно %.2f", num1, num2, ((double)num1 / num2));
    }

    static void solve(int arithmetic, int num1, int num2) {
        switch (arithmetic){
            case 1:
                addition(num1, num2);
                break;
            case 2:
                subtraction(num1, num2);
                break;
            case 3:
                multiplication(num1, num2);
                break;
            case 4:
                division(num1, num2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nЗдрасте! Это калькулятор v3.");
        while (true) {
            System.out.print("\nВведите первое целое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите второе целое число: ");
            int num2 = scanner.nextInt();
            System.out.print("Выберите действие (1-5) с введёнными числами\n(1. Сложение, 2. Вычитание, 3. Умножение, 4. Деление, 5. Выход): ");
            int arithmetic = scanner.nextInt();
            if (arithmetic > 0 & arithmetic < 5)
                solve(arithmetic, num1, num2);
            else {
                System.out.println("Калькулятор выключен.");
                break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
