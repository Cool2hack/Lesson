 class Parent {
    Parent method(){
          return new Parent();
      }
 }

 class Child extends Parent {
    @Override
     Child method(){
        return new Child();
    }
 }



public class LessonOverride {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        //System.out.println(parent.method());
        System.out.println(child.method());
    }

}
