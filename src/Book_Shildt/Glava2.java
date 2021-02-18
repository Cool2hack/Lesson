package Book_Shildt;

public class Glava2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ign;
        for (; ; ) {
            do {
                System.out.println("Справка");
                System.out.println("1. If");
                System.out.println("2. Switch");
                System.out.println("3. For");
                System.out.println("4. While");
                System.out.println("5. Do-While");
                System.out.println("6. Break");
                System.out.println("7. Continue");
                System.out.println("Нажмите q для выхода из программы");

                ch = (char) System.in.read();

                do {
                    ign = (char) System.in.read();
                } while (ign != '\n');
            } while (ch < '1' | ch > '8' & ch != 'q');

            if (ch == 'q') break;
        }
    }
}

        /*char ch, ignore, answer = 'K';

        do {
            System.out.print("Задумана буква. Введите ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
                System.out.println(ignore);
            } while (ignore != '\n');


            if (ch == answer) System.out.println("Верно");
            else {
                System.out.println("Не верно");
                if (ch < answer) System.out.println("попробуйте букву ближе к концу");
                else System.out.println("попробуйте букву ближе к началу\n");
            }
        } while (answer !=ch);
    }
}*/