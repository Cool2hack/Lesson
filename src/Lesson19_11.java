public class Lesson19_11 {

    public static void main(String[] args) {
        /*String s = new String("abc");
        String s2 = s.concat("def");
        System.out.println(s);
        System.out.println(s2);*/
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.insert(stringBuilder.length(),"-");
        System.out.println(stringBuilder);

    }
}
