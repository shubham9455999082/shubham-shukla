class thread1 extends thread 
{
thread1(String s)
{
super(s)
}
public void run()
{
for(i=0; i<5;, i++)
{
System.out.println(getname())
}
}
}
class thread2 extends thread
{
thread2(String s)
{
super(S)
}
public void run()
{
for(i=1; i<10; i++)
{
System.out.println(getname())
}}
}
public static void main(String...s)
{
thread t1=new thread("hello");
thread t2=new thread("hi");
t1.start(); t2.start();

}
}
}