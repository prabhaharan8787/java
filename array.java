import java.util.Scanner;
class array{
public static void main(String args[])
{
int n;
System.out.print("enter the size of n: ");
Scanner se =new Scanner(System.in);
 n=se.nextInt();

int [] arr = new int [n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
{

arr[i]=se.nextInt();


}
System.out.println(" elements are ");
for(int i=0;i<n;i++)
{
//System.out.println(arr[i]); 

if(i%2== 0)
{
 System.out.println( "even "+arr[i]); 
}
else
{
 System.out.println( "odd "+arr[i]); 
}
}
}
}



