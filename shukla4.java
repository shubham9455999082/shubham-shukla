import java.io.*;
class shukla4
{
public static void main(String...s) throws IOException
{
FileIntputStream fr= new FileIntputStream("shubham.txt");
PrintStream pr = new PrintStream(fr);
pr.println("hello");
pr.println("hi");
}
}