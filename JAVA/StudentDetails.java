import java.util.*;
class Student{
String Sname;
int roll,m1,m2,m3,m4,total,avg;
void input(int a,int b,int c,int d)
{
    m1=a;
    m2=b;
    m3=c;
    m4=d;
    total=(m1+m2+m3+m4);
    avg=(m1+m2+m3+m4)/4;
}
void display(String name, int r)
{
    Sname=name;
    roll=r;
    System.out.println("Student name: "+Sname);
    System.out.println("Roll no: "+roll);
    System.out.println("Marks of 4 different subjects: "+m1+" "+m2+" "+m3+" "+m4);
    System.out.println("Total mark= "+total+" "+", Average mark= "+avg);
}
void result()
{
    if (avg<30)
    System.out.println("You are fail");
    else if(avg>=30 && avg<=49)
    System.out.println("Third division");
    else if(avg>=50 && avg<=59)
    System.out.println("Second division");
    else
    System.out.println("First division");
}
}

public class StudentDetails {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your name: ");
    String s1=sc.nextLine();
    System.out.println("Enter roll no: ");
    int r1=sc.nextInt();
    System.out.println("Enter marks of 4 different subjects: ");
    int w=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();

    Student obj=new Student();
    obj.input(w,x,y,z);
    obj.display(s1,r1);
    obj.result();
  }  
}
