import java.io.*;
import java.util.*;
public class Thread
{
public static void main (String args[])
{
Thread th =new Thread();
System.out.println("number by line 5 sec: ");
try
{
for(int i=1;i<=10;i++)
{
System.out.println(i);
th.sleep(8000);
}
}
catch(interruptedException e)
{
System.out.println("thread interrupted..");
e.printstacktrace();
}
}
}
