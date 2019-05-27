interface my
{
public void display();
}

 class child implements my
{
 void display()
{
super.display();
System.out.println("child show");
}
 void display()
{
System.out.println("il love dadaji");
super.display();
}
public static void main(String...s)
{
child c1=new child();
c1.display();
c1.display();
}
}

