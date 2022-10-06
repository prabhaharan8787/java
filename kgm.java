class kgm{
public static void main(String args[])
{
int a,b=0;
int temp;
int n=696;
temp=n;    
  while(n>0){    
   a=n%10;  
   b=(b*10)+a;    
   n=n/10; 
   }
   if(temp==b)
   {
   System.out.println("The given num is palindrome...");
   }
   else
   {
    System.out.println("The given num is not palindrome...");
    }
    }
    }
    
