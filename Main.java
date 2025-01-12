import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        System.out.println(Student.count);
        new Student();
        System.out.println(Student.count);
        new Student();
        System.out.println(Student.count);

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        System.out.printf("1 + 2 = %d\n", Calculator.add(1, 2));
        System.out.printf("1.5 + 2.5 = %f\n", Calculator.add(1.5, 2.5));
        System.out.printf("1 - 2 = %d\n", Calculator.substract(1, 2));
        System.out.printf("1.5 - 2.5 = %f\n", Calculator.substract(1.5, 2.5));
        System.out.printf("1 * 2 = %d\n", Calculator.multiply(1, 2));
        System.out.printf("1.5 * 2.5 = %f\n", Calculator.multiply(1.5, 2.5));
        System.out.printf("1 / 2 = %d\n", Calculator.divide(1, 2));
        System.out.printf("1.0 / 2.0 = %f\n", Calculator.divide(1.0, 2.0));

        System.out.println("********************");
        System.out.println("Задача 3");
        System.out.println("********************");
        final int MAX_LENGTH = 10;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            String line = scanner.nextLine();
            if(line.length() > MAX_LENGTH)
            {
                System.out.println("Строка длиннее максимально допустимой длины.");
                break;
            }
        }
    }
}