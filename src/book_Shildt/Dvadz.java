package book_Shildt;

public class Dvadz {
    char choice;
    boolean b;

    boolean isvalid(int choice) {
        if (choice < 1 | choice > 7 & choice != 'q') return false;
        else return true;
    }

    public static void main(String[] args) throws java.io.IOException {
        char ignore, choice;
        Dvadz dvadz = new Dvadz();
        for (int i = 0; i < 10; i++) {
            System.out.println(dvadz.isvalid(i));
        }
    }
}
