package youtube;

public class Queue {
    private char q[];
    private int putloc, getloc;


    // Создание пустой очереди заданного размера
    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // Создание очереди на основе имеющегося объекта youtube.Queue
    Queue(Queue ob) {
        this.putloc = ob.putloc;
        this.getloc = ob.getloc;
        this.q = new char[ob.q.length];

        for (int i = 0; i < ob.q.length; i++) {
            q[i] = ob.q[i];
        }
    }

    // Создание массива на основе массива исходных значений
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++)
            put(a[i]);
    }

    // Наполнение очереди
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }

    // Излечение очереди
    char get() {
        if (getloc == putloc) {
            System.out.println("Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class QueueDemo{

    public static void main(String[] args) {
        int size = 10;
        char name[] = {'T', 'o', 'm'};
        char ch;

        Queue queue1 = new Queue(size);

        for (int i = 0; i < size; i++) {
            queue1.put((char) ('A' + i));
        }

        Queue queue2 = new Queue(name);

        Queue queue3 = new Queue(queue1);

        System.out.print("Ochered 1: ");

        for (int i = 0; i < size; i++) {
            System.out.print(queue1.get() + " ");
        }
        System.out.println();

        System.out.print("Ochered 2: ");

        for (int i = 0; i < name.length; i++) {
            System.out.print(queue2.get() + " ");
        }

        System.out.println();

        System.out.print("Ochered 3: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue3.get() + " ");
        }
        System.out.println();
    }
}
