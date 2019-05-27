import java.io.*;
 public class shukla3
{
public static void main(String...s)
{
try
{

FileOutputStream fout=new FileOutputStream("shubham.txt");
fout.write(65);
fout.write(66);
fout.write(67);
fout.write(68);

fout.close();
System.out.println("HI SAURAV");
}
catch(Exception e)
{
System.out.println(e);
}
}
}