public class Cylinder {
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea(){
        return (2*Math.PI*radius*height)+(2*lidArea());
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

}
class Cylinder1{
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.radius=5.0;
        c1.height=5.0;
        System.out.println("Lid Area :"+c1.lidArea());
        System.out.println("Total Surface Area :"+c1.totalSurfaceArea());
        System.out.println("Volume :"+c1.volume());

    }
}
