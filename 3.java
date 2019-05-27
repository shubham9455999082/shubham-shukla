class shukla
{ 
static String cname="HARCOURT BUTLER TECHANICAL UNIVERSITY";
 static String branch="computer science engineering";
int age, fee ,srnumber;
String ename;
void show(int fe, int a, String en ,int srn)
{ 
ename=en;
fee=fe; 
age=a;
srnumber=srn;
System.out.println("college name="+cname);
System.out.println("semister fee="+fee);
System.out.println("age="+age);
System.out.println("name="+ename);
System.out.println("branch="+branch);
System.out.println("sr number="+srnumber);
}
public static void main(String...s)
{
shukla sh=new shukla();
sh.show(93950,  19,"shubham" ,170104054);
sh.show(93500, 20, "munna", 170104035);
sh.show(93590, 20, "varun singh" ,170104060);
}
}