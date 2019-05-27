class shukla 
{
int salary;
float fee;
String ename;
void show(int sl, float fe, String en)
{
salary=sl;
fee=fe;
ename=en;
}
void input()
{ 
System.out.println(salary);
System.out.println(fee);
System.out.println(ename);
}
public static void main(String...s)
{
shukla sh=new shukla();
sh.show(23, 75000.45f, "shubham");
}
} 