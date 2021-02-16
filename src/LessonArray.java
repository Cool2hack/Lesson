public class LessonArray {
    public static void main(String[] args) {
        //int [][] i = new int[]{5,2,4};
        method(new String[][]{{"Один", "Два", "Три"}, {"1", "2", "3"}});
    }

    static void method(String[][] i) {
        System.out.println("Длина 1-го массива: " + i[0].length);
        for (int j = 0; j <i[0].length; j++) {
            System.out.println(i[0][j]);
            System.out.println(i[1][j]);
        }
    }
}
