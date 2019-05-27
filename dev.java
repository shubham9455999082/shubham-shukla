abstract class shukla 
{
abstract void gear();
void shubh()
{
  System.out.println("jaguar");
}
}
class child extends shukla 
{ 
void input()
{ 
System.out.println("honda");
}
//public void gear()
//{ 
//System.out.println("maruti");
//} 
public static void main(String...s)
{
 child c=new child();
c.input();
c.shubh();
//c.gear();
}
}
