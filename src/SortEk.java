public class SortEk {

    static void qs (char arr[]){
        qsort (arr, 0, arr.length-1);
    }

    private static void qsort (char arr[], int left, int right){
        int i = left;
        int j = right;
        char x = arr[(left+right)/2];
        char y;

        do {
            while ((arr[i] < x) && (i < right)) i++;
            while ((arr[j] > x) && (left < j)) j--;

            if (i <= j){
                y = arr[i];
                arr[i] = arr[j];
                arr[j] = y;
                i++;
                j--;
            }
        }while (i <= j);

        if (i < right) qsort(arr, i, right);
        if (left < j) qsort(arr, left, j);
    }
}

class Sor {
    public static void main(String[] args) {
        char ch [] = {'9', '8', '7', '6', '5', '4', '3', '2', '1', '0'};

        SortEk.qs(ch);

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}

