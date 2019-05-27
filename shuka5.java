import java.io.*;
class shuka5
{
public static void main(String...s)
{
try
{
FileIntputStream fr=new FileOutputStream("shubham.txt");
BufferedInputStream br=new BufferedInputStream(fr);
int i;
{
while((i=br.read())!=-1)
{
System.out.println((char)i);
}
br.close();
fr.close();
}
catch(Exception e){}
{
System.out.println(e);
}
}


