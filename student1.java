class student{
int id;
String name;
int age;
}
class student1{
public static void main(String args[])
{
student p1=new student();
student p2=new student();
student p3=new student();
p1.id=1;
p1.name="pk";
p1.age=25;

p2.id=2;
p2.name="somu";
p2.age=20;
p3.id=3;
p3.name="ragu";
p3.age=25;
System.out.println(p1.id+ " " +p1.name+ " " +p1.age); 
System.out.println(p2.id+ " " +p2.name+ " " +p2.age); 
System.out.println(p3.id+ " " +p3.name+ " " +p3.age); 
}
}
