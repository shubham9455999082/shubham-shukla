import java.io.*;
class DataStream
{
public static void main(String s1[])throws IOException
{
DataInputStream din=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("su.txt");
DataOutputStream dout=new DataOutputStream(fout);

String  s="  ";
while(!s.equals("stop"))
{
s=din.readLine();
System.out.println(s);
dout.writeChars(s);//dout.WriteUTF(s);//dout.writeBytes(s);

//dout.flush();
}
din.close();
dout.close();

}
}

