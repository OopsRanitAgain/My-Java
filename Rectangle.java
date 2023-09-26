public class Rectangle {
    public int length;
    public int breath;
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
    public boolean isSquare(){
        if(length==breath)
            return true;
        else
            return false;
    }
}
class Rectangle1{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=10;
        r1.breath=5;
        System.out.println("Area :"+r1.area());
        System.out.println("Perimeter :"+r1.perimeter());
        System.out.println("Is it a Square :"+r1.isSquare());
    }
}