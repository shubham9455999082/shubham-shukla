import java.io.*;
import java.net.*;
class shukla
{
public static void main(String...s)throws Exception
{
ServerSocket ss=new ServerSocket(111);
Socket p=ss.accept();
System.out.println("connection");
OutputStream ob=p.getOutputStream();
PrintStream ps=new PrintStream(ob);
String str="hello";
ps.println(str);
ps.println("now server secured");
ps.println("bye");
ps.close();
ss.close();
p.close();
}
}
