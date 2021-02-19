package book_Shildt;

public class Glava7 {
}

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape(){
        width = height = 0;
        name = "none";
    }
    TwoDShape(double width, double height, String name){
        this.width = width;
        this.height = height;
        this.name = name;
    }
    TwoDShape(double x, String name){
        width = height = x;
        this.name = name;
    }
    TwoDShape(TwoDShape ob){
        width = ob.getWidth();
        height = ob.getHeight();
        name = ob.getName();
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public String getName() {
        return name;
    }

    void showDim (double width, double height){
        System.out.println("Ширина и высота соответственно: " + width + " " + height);
    }
    abstract double area ();
}

class Triangle extends TwoDShape{
    private String style;

    Triangle(){
        super();
        style = "none";
    }
    Triangle(double x){
        super(x, "треугольник");
        style = "закрашенный";
    }
    Triangle(String s, double width, double height){
        super(width,height,"треугольник");
        style = s;
    }
    Triangle (Triangle ob){
        super(ob);
        style = ob.style;
    }

    double area () {
        return getHeight() * getHeight() / 2;
    }
    void showStyle (){
        System.out.println("Style: " +style);
    }
}

class Rectangle extends TwoDShape{

    Rectangle(){
        super();
    }
    Rectangle(double width, double height){
        super(width,height, "прямоугольник");
    }
    Rectangle(double x){
        super(x, "квадрат");
    }
    Rectangle (Rectangle ob){
        super(ob);
    }

    double area (){
        return getHeight() * getWidth();
    }
}

class Circle extends TwoDShape{
    Circle(){
        super();
    }
    Circle(double x){
        super(x, "круг");
    }
    double area(){
        return getWidth()*getWidth()*3.1415926535/4;
    }
}

class AbsShape {
    public static void main(String[] args) {
        TwoDShape twoDShape[] = new TwoDShape[4];
        twoDShape[0] = new Triangle("контурный", 8, 12);
        twoDShape[1] = new Rectangle(10);
        twoDShape[2] = new Rectangle(10,4);
        twoDShape[3] = new Circle(7);

        /*for (int i = 0; i < twoDShape.length; i++) {
            System.out.println("Объект - " + twoDShape[i].getName());
            System.out.println("Площадь - " + twoDShape[i].area());
            System.out.println();
        }*/
        System.out.println(twoDShape[3].area());
    }
}

