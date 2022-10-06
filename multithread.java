class ClassA extends Thread
{
public void run()
{
System.out.println("start thread A...");
for(int i = 1;i<=5;i++)
{
if(i==1)
System.out.println("from thread A:i="+i);
}
System.out.println("...exit thread A");
}
}

class ClassB extends Thread
{
public void run()
{System.out.println("start Thread b...");
for(int j = 1;j<=5;j++)
{
System.out.println("from Thread B:j="+j);
if(j==2)
{
try{
sleep(1000);
}
catch(Exception e){}
}
}
System.out.println("...exit thread B");
}
}

class ClassC extends Thread
{
public void run()
{System.out.println("start Thread b...");
for(int k = 1;k<=5;k++)
{
System.out.println("from Thread B:j="+k);
if(k==3)
{
try{
sleep(1000);
}
catch(Exception e){}
}
}
System.out.println("...exit Thread C");
}
}
public class multithread
{
public static void main(String args[])
{
ClassA t1 = new ClassA();
ClassB t2 = new ClassB();
ClassC t3 = new ClassC();
t1.start();
t1.yield();
t2.start();
t3.start();
System.out.println("...end of the execution");
}
}

