class shukla
{
void show()
{
System.out.println("i love dadaji");
}
}
class papaji extends shukla
{
void input()
{
System.out.println(" i love papaji");
}
}
class child extends papaji
{
void display()
{
System.out.println(" shubham kumar shukla");
}
public static void main(String...s)
{
child c1=new child();
c1.show();
c1.input();
c1.display(;
}
}
