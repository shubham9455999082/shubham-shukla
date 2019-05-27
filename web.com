import java.io.*;
import java.net.io;
class shukla
{
public static void main(String arg[]) throws Exception
{
int c;
socket s=new socket("internic.net",888);
inputstream in=s.getinputstream():
outputstream out=s.getoutputstream();
String s=(arg.length=0? "absorne.com": arg[0]) +"\n";
byte buf[]=str.getbytes();
out write(buf);
while((c=in.read())!=-1)
{
System.out.println((char)c);
}
s.close();
}
}