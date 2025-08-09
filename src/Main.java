import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Блок кода, отвечающий за получение данных от пользователя
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt(); // объявление переменной Второе число

        // Блок кода, отвечаюший за вычисление операций
        int sum = firstNumber + secondNumber; // операция сложения
        int difference = firstNumber - secondNumber; // операция вычитания
        int multiplication = firstNumber * secondNumber; // операция умножения
        double quotient = (double) firstNumber / secondNumber; // операция деления

        // Блок кода, отвечающий за вывод значений операций
        System.out.println("Сумма двух чисел: " + sum);
        System.out.println("Разность двух чисел: " + difference);
        System.out.println("Произведение двух чисел: " + multiplication);
        System.out.println("Частное двух чисел: " + quotient);
    }
}