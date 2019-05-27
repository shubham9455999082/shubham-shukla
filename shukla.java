import java.io.*;
import java.net.*;
class shukla
{
public static void main(String arg[]) throws Exception
{
int c;
Socket s=new Socket("internic.net",888);
InputStream in = s.getInputStream();
OutputStream out=s.getOutputStream();
String str=(arg.length == 0 ? "osborne.com": arg[0]) +"\n";
byte buf[] = str.getBytes();
out.write(buf);
while((c=in.read())!= -1)
{
System.out.println((char)c);
}
s.close();
}
}