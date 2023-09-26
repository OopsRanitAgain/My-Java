public class calculateArea {
    static double area(double a, double b){
        return a*b;
    }
    static double area(double r){
        return Math.PI*r*r;
    }

    public static void main(String[] args) {
        System.out.println("Area of Rectangular "+area(2.5d,1.5d));
        System.out.println("Area of A triangle "+area(4.5));
    }
}
