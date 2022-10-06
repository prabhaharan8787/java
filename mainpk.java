abstract class pk{
abstract void id(int i);
}
class over extends pk
{
private int id;
}
void getId(int i)
{
return id;
}
void setId(int i)
{
this.id=i;
}

class mainpk{
public static void main(String args[])
{
pk ob = new over();
ob.setId(3);
}
