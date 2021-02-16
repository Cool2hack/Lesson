public class CmInch {
    public static void main(String[] args) {
        int cm, inch, count = 0;
        for (int i = 1; i <= 144; i++) {
            System.out.println(i + " inch is " + i*0.393701);
            count++;
            if (count == 12) {
                System.out.println();
                count = 0;
            }
        }
    }
}
