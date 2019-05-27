class shukla 
{
static String cname="google";
static int age=18;
String name;
int salary;
void show(String s1, int s2)
{
name=s1;
salary=s2;
}
void get()
{
System.out.println(name);
System.out.println(salary);
System.out.println(cname);
System.out.println(age);
}
public static void main(String...s)
{
shukla a=new shukla();
a.show("lalu", 101);
a.get();
shukla a2=new shukla();
a2.show("sonia",51);
a2.get();
}
}