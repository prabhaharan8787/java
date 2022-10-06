import java.io.*;
import java.util.*;
public class abc extends Thread
{
public void run()
{
System.out.println("thread started...");
}
public static void main(String args[])

{
abc g1 =new abc();
g1.run();
}
}
