package Home_Work_1;

public class Task_7 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int sumMax;
        int[] mass = {1, 0, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                sum1 = sum1 + mass[i];
            } else {
                sum2 = sum2 + mass[i];
            }
        }
        sumMax = Math.max(sum1, sum2);
        System.out.println("Максимальный элемент: " + sumMax);
    }
}
