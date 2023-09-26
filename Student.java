public class Student {
    public String name;
    public long rollNum;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public double average(){
        return total()/3;
    }
    public String grade(){
        if(average()>90&&average()<100)
            return "O";
        else if(average()>80&&average()<=90)
            return "A";
        else if(average()>70&&average()<=80)
            return "B";
        else if(average()>60&&average()<=70)
            return "C";
        else
            return "Fail";
    }

}
class Student1{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ranit";
        s1.rollNum=2241016204L;
        s1.course="Btech CSE";
        s1.m1=80;s1.m2=90;s1.m3=90;
        System.out.println("Name :"+s1.name);
        System.out.println("Roll Number :"+s1.rollNum);
        System.out.println("Course :"+s1.course);
        System.out.println("Total Marks :"+s1.total());
        System.out.println("Average marks :"+s1.average());
        System.out.println("Grade :"+s1.grade());
    }
}