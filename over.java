class shukla
{
void show()
{
System.out.println("i love papaji");
}
}
class child extends shukla
{
void show()
{
System.out.println("i love dadaji");
}
public static void main(String...s)
{
child c1=new child();
c1.show();
c1.show();
}
}