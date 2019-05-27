import java.io.*;
class shukla5
{
public static void main(String...s) throws IOException
{
FileIntputStream fr=new FileOutputStream("shubham.txt");
BufferedInputStream br=new BufferedInputStream(fr);
int i;
{
while((i=br.read())!=-1)
{
system.out.println((char)i);
}
br.close();
fr.close();
}
}

