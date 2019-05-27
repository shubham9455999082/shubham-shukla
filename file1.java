import java.io.*;  
public class file1 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("sar.txt");    
             String s="i love you";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
}
}