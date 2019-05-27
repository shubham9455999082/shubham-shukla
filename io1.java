import java.io.*;

class shukla
{
public static void main(String arg[]) throws IOException
{ 
fileoutputStream fw = newoutputStream("abc.txt");
String s="india is a greate country";
byte ch[]=s.getbyte();
for(int i=0; i<ch.length; i++)
{
fw.write(ch[i]);
}
fw.close();
{
System.out.println("file created");
}
}
}