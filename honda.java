abstract class automobile
{
abstract void show();
void display()
{
System.out.println("jaguar");
}
}
class honda extends automobile
{
void input()
{
System.out.println("tata");
}
void show()
{
System.out.println("4 years");
}
public static void main(String...s)
{
honda h1=new honda();
h1.show();
h1.display();
h1.input();
}
}
