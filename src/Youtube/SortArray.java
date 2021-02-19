package Youtube;

public class SortArray {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 4, 6, 0, -5, 140},
                {0, 5, 3, 10, 4, 102}
            };
        int min, max;

        min = max = arr[0][0];

        for (int t[] : arr) {
            for (int t2 : t){
                if (t2 < min) min = t2;
                if (t2 > max) max = t2;
            }
        }
        System.out.println("min " + min + " max " + max);
    }
}
