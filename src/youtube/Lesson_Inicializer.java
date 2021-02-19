package youtube;

class Parents {
    Parents() {
        System.out.println("youtube.Parents constructor");
    }
}

public class Lesson_Inicializer extends Parents{
    static {
        System.out.println("Static inicializer");
    }
    {
        System.out.println("Inicializer");
    }
    Lesson_Inicializer() {
        //super();
        System.out.println("Constructor Class");
    }

    public static void main(String[] args) {
        new Lesson_Inicializer();
    }
    static {
        System.out.println("2");
    }
}

