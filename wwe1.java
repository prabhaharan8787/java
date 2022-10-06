class wwe{
int id;
String character;
String channel;
 
 void showtime(String c, String ch)
 {
 character=ch;
 channel=c;
 System.out.println("the value for char & channel " +ch+ " " +c );
 }
 void out(int i)
 {
   id =i;
  System.out.println("the value for id " +i);
  }
  }
  class wwe1{
  public static void main(String args[])
  {
  wwe rko =new wwe();
  rko.showtime("ten1", "rey" );
  rko.out(12);
  }
  }
    
