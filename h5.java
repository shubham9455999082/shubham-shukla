class shukla 
{
int age;
String ename;
static String  cname="google";
void show(int a, String en)
{
age=a;
ename=en;

}
void input()
{
System.out.println(age);
System.out.println(ename);
System.out.println(cname);
}
public static void main(String...s)
{
shukla sh=new shukla();
sh.show(15, "shubham");
sh.input();
}
}
