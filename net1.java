import java.io.*;
import java.net.*;
class shukla
{
public static void main()throws exception
{
socket s= new socket("local host 111");
InputStream ob=s.getinputstream();
buffer reader br=new bufferreader(newinputstreamreader(ob)));
String str;
while(strr=br.readline());