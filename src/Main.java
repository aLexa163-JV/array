public class Main {
    public static void main(String[] args) {

        //task1

        int[] cash = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i : cash) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task2

        int[] expenses = {15, 55, 96, 8, 43};
        int max = 0;
        int min = expenses[0];
        for (final int iMax : expenses) {
            if (iMax > max) {
                max = iMax;
            }
        }
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] < min) {
                min = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        //task3

        double[] average = {24, 52, 41, 32, 61};
        double sum1 = 0;
        for (double i : average) {
            sum1 = sum1 + i;
        }
        sum1 = sum1 / average.length;
        System.out.println("Средняя сумма трат за месяц составила " + sum1 + " рубля");

        //task4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i] + " ");
        }
    }
}