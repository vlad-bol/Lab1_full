import java.util.Scanner;
import static java.lang.Math.*;


class Lab1_combo {
    void main() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1-Переменные 2-Математические функции 3-Логические ветвления 0-Выход");
            switch (sc.nextLine()) {
                case "1":
                    System.out.print("Введите x,y: ");
                    double x = sc.nextDouble(), y = sc.nextDouble();
                    sc.nextLine();
                    double min = min(x, y);
                    System.out.println("Меньшее число после деления на10: " + (min/10));
                    break;

                case "2":
                    System.out.print("Введите a, b: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    sc.nextLine();
                    double maxAB = max(a, b);
                    double minAB = min(a, b);
                    System.out.println("Наибольшее max(a,b): " + maxAB);
                    System.out.println("Наименьшее min(a,b): " + minAB);

                    double num = 5* max(a, b + 2) - 4 * min(1 - a, b);
                    double den = 3 + max(a, b +2) * min(1 - a, b);
                    System.out.println("Результат: " + (den != 0 ? num/den : "Ошибка"));
                    break;

                case "3":
                    System.out.print("Введите x: ");
                    double x2 = sc.nextDouble();
                    sc.nextLine();
                    double Y = x2 <= -2 ? pow(x2, 5)- tan(2 * x2 - 1) :
                            x2 <= 1 ? 3 * x2 * (1+ exp(x2 + 1)) : pow(sin(x2), 5 );
                    double F = x2 <= -2 ? exp(sin(x2)) :
                            x2 <= 1 ? x2 * x2 : cos(x2) >= 0 ? sqrt(cos(x2)) : Double.NaN;
                    System.out.println("Y=" + Y + " F=" + F);
                    break;

                case "0":
                    sc.close();
                    return;

                default: System.out.println("Ошибка!");
            }
        }
    }
}