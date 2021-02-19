package book_Shildt;

class Glava6 {
}

class Ek{
    void zad (String str){
        int i = 0;
        System.out.print(str.charAt(str.length()-1));
        System.out.print(str.charAt(str.length()-2));
        System.out.print(str.charAt(str.length()-3));
        System.out.print(str.charAt(str.length()-4));
        System.out.print(str.charAt(str.length()-5));
        System.out.print(str.charAt(str.length()-6));
//        if (i < str.length()) {
//            i++;
//            zad(str);
//        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "Строка";
/*        First.Ek ek = new First.Ek();
        ek.zad(str);*/

        print(str);
    }

    private static void print (String str){
        print1(str, str.length()-1);
    }

    private static void print1(String str, int index){
        System.out.print(str.charAt(index));
        if(index > 0)
            print1(str, --index);
    }
}


//class Test {
//    int a;
//    Test (int i) {
//        a = i;
//    }
//
//    void swap (Test ob){
//        int t = this.a;
//        this.a = ob.a;
//        ob.a = t;
//    }
//
//    public static void main(String[] args) {
//        Test test1 = new Test(2);
//        Test test2 = new Test(10);
//
//        System.out.println(test1.a);
//        System.out.println(test2.a);
//        System.out.println();
//
//        test1.swap(test2);
//
//        System.out.println(test1.a);
//        System.out.println(test2.a);
//    }
//
//}

//class Sumation {
//    int sum, b;
//
//    Sumation (int n){
//        b = 3;
//        sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//        }
//    }
//
//    Sumation (Sumation ob){
//        sum = ob.sum;
//        b = ob.b;
//    }
//}
// class SumationDemo {
//     public static void main(String[] args) {
//         Sumation s1 = new Sumation(5);
//         Sumation s2 = new Sumation(s1);
//
//         System.out.println(s1.sum);
//         System.out.println(s1.b);
//         System.out.println(s2.b);
//     }
// }



