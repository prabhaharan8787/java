class class A extends Thread{
{
public void run()
{
System.out.println("Start the thread a: ");
for(int i=1;i<=5;i++)
{
if(i==1) yield();
}
System.out.println("From thread a: i= " +i);
}
System.out.println("...exit thread a");
}
}
class class B extends Thread{
public void run(){
System.out.println("Start thread b..");
for(int j=1; j<=5;j++)
{
if(j==2)
stop();
}
System.out.println("..exit the thread b");
}
}

public class threads
{
public static void main(String args[])
{
class A s1=new class A();
class B s1=new class B();
t1.start(); 
t2.start();
}
} 

