abstract class shukla
{
abstract void show();
abstract void insert();
void input()
{
System.out.println("shubham");
}
}
class child extends shukla
{
void display()
{
System.out.println("i love papaji");
}
 void show()
{
System.out.println(" i love both dadaji and papaji");
}


void insert(int x, int y)

x=10,y=30;
{
System.out.println(x+y);
}
public static void main(String...s)
{
child c1=new child();
c1.input();
c1.display();
c1.insert();
}
}