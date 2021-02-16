public class Sort {

    static void qsort (char[] mas){
        qs(mas, 0, mas.length-1, 1);
    }

    private static void qs (char mas[], int left, int right, int number){
        int i = left;
        int j = right;
        char x = mas[(left+right)/2];
        char y;

        System.out.println("=========================================");
        System.out.println("Старт рекурсии N " + number);
        System.out.println("x = " + x);
        System.out.println("left = " + left);
        System.out.println("right = " + right);
        System.out.println("------------------------------------------");

    do {
            while ((mas[i] < x) && (i < right)) {
//                System.out.println("Выполнилось условие с i = " + i);
                i++;
            }
            while ((mas[j] > x) && (j > left)) {
//                System.out.println("Выполнилось условие с j = " + j);
                j--;
            }

            if (i <= j){
                System.out.println("до замены местами i = " + i + " mas[i] = " + mas[i] + " j = " + j + " mas[j] = " + mas[j]);
                y = mas[i];
                mas[i] = mas [j];
                mas[j] = y;
                System.out.println("после замены местами i = " + i + " mas[i] = " + mas[i] + " j = " + j + " mas[j] = " + mas[j]);
                i++;
                j--;
                System.out.println();
            }
        } while (i <= j);

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        for (int k = 0; k < mas.length; k++) {
            System.out.print(mas[k] + " ");
        }
        System.out.println();
//        System.out.println();

        if (i < right) {
            System.out.println("recurs; i = " + i + " left = " + left + " right = " + right);
            qs(mas, i, right, ++number);
        }
        if (left < j) {
            System.out.println("recurs; j = " + j + " left = " + left + " right = " + right);
            qs(mas, left, j, ++number);
        }

        System.out.println("Конец рекурсии N " + number);
        System.out.println("=========================================");
    }
}
class SortDemo {
    public static void main(String[] args) {
        char ch[] = {'7', '9', '3', '5', '5', '7', '9'};
        System.out.println("Массив до сортировки");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();
        Sort.qsort(ch);
        System.out.print("Массив после сортировки");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(" " + ch[i] + " ");
        }
        System.out.println();
    }
}