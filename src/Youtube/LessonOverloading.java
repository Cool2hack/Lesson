package Youtube;

public class LessonOverloading {
    public static void main(String[] args) {
        LessonOverloading lessonOverloading = new LessonOverloading();
        short b = 5;
        lessonOverloading.method((int)b);
    }

    void method(Integer i){
        System.out.println("Integer");
    }

}
