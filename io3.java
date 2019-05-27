import java.io.*;
 public class shukla
{
public static void main(String...s)
{
try
{

FileOutputStream fout=new FileOutputStream("shubham.txt");
fout.write(65);
fout.close();
System.out.println("HI SAURAV");
}
catch(Exception e)
{
System.out.println(e);
}
}
}