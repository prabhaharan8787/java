abstract class pk
{
abstract void home(String a);
abstract void ground(String b);
abstract void father(String c);
}
class over extends pk
{
void home(String a)
{
System.out.println("the amount that i get in home " +a);
}
void ground(String b)
{

System.out.println("the amount that i waste in ground " +b);
}
void father(String c)
{
System.out.println("at last my dad tell " +c);
}
}
class overall
{
public static void main(String args[]) 
{
pk obj = new over();
obj.home("1000");
obj.ground("1500");
obj.father("get out from home ");
}

}
