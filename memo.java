class shubham
{
int age;
String cname, ename, fname, mname, address, cnumber;
float fee;
double salary;
void show(int a, String cn, String en, String mn, String cnm, String ad,  String fn, float fe, double sl)
{
ename=en; mname=mn; fname=fn; cnumber=cnm; address=ad; fee=fe; salary=sl;  cname=cn; age=a;
}
void input()
{
System.out.println(cname);
System.out.println(ename);
System.out.println(mname);
System.out.println(fname);
System.out.println(address);
System.out.println(fee);
System.out.println(salary);
System.out.println(cnumber);
System.out.println(age);
}
public static void main(String...s)
{
shubham s1=new shubham();
s1.show("kumar", "hbtukanpur", "vikasnagarcolonysitapur", "google", "kumodani", 98000.30f, 45000.00, "rajendraprasadshukla", 20);
}
} 