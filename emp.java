class emp
{
int age;
String companyname, ename;
float fee;
double salary;

void show(String en, int a, String cn, float fe, double sl)
{
ename=en;
age=a;
companyname=cn;
fee=fe;
salary=sl;
}
void input()
{
System.out.println(ename);
System.out.println(age);
System.out.println(companyname);
System.out.println(fee);
System.out.println(salary);
}
public static void main(String...s)
{
emp e1=new emp();
e1.show("shubham", 15, "google", 154000.45f, 23400.000);
e1.input();
emp e2=new emp();
e2.show("abhinav", 19, "microsoft", 234000.25f, 23467.00);
e2.input();



}
}