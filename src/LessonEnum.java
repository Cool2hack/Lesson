import java.util.Scanner;

public class LessonEnum {
    enum Employ {
        ST_INZH("Старший инженер"), GL_SPEC("Главный специалист"), ZAM_NACH("Заместитель начальника отдела");
        String dolzhnost;
        Employ(String dolzhnost){
            this.dolzhnost = dolzhnost;
        }
    }

    public static void main(String[] args) {
        Employ employ = Employ.ST_INZH;
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Введите Ф.И.О. следующего работника - " + employ.dolzhnost);
        person.setName(scanner.nextLine());

        Employ employ1 = Employ.GL_SPEC;
        Person person1 = new Person();
        System.out.println("Введите Ф.И.О. следующего работника - " + employ1.dolzhnost);
        person1.setName(scanner.nextLine());
        System.out.println("В отделе работают следующие работники:");
        System.out.println(employ.dolzhnost + " отдела: " + person.name);
        System.out.println(employ1.dolzhnost + " отдела: " + person1.name);
    }
}

class Person {
    String name;

    Person(String firstName, String lastName, String dolzhnost){
        this.name = lastName;
    }
    Person(){}

    void setName (String name){
        this.name = name;
    }

}