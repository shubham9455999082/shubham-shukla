import java.io.*;  
public class shukla2 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("shubham.txt");    
             String s=(" 1. ilove my india"); 
String s1="2. india is great country";   
             byte b[]=s.getBytes();//converting string into byte array
byte b1[]=s1.getBytes();    
             fout.write(b); 
fout.write(b1);   
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  