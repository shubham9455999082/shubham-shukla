abstract class plan
{
abstract void show();
}
class demo extends plan
{
int unit, rate;
void show()
{
unit=10;
rate=30;

System.out.println("demo bill"+(unit*rate));
}
}
class commercial extends demo
{
int unit, rate;

void show()
{
unit=20;
rate=35;
System.out.println("demo bill"+(rate*unit));
}
public static void main(String...s)
{
commercial c1=new commercial();
c1.show();
c1.show();
}
}