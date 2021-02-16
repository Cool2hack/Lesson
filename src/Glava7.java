public class Glava7 {
    public static void main(String[] args) {

    }
}

class TwoDShape {
    private double widht;
    private double height;
    private String name;

    TwoDShape(){
        widht = height = 0;
        name = "none";
    }

    TwoDShape(double widht, double height, String name){
        this.widht = widht;
        this.height = height;
        this.name = name;
    }

    TwoDShape(double x, String name){
        widht = height = x;
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidht(double widht) {
        this.widht = widht;
    }
    public double getHeight() {
        return height;
    }
    public double getWidht() {
        return widht;
    }
    public String getName() {
        return name;
    }

    void showDim (double widht, double height){
        System.out.println("Ширина и высота соответственно: " + widht + " " + height);
    }

    double area (){
        System.out.println("Этот метод необходимо переопределять в остальных подклассах");
        return 0.0;
    }
}

