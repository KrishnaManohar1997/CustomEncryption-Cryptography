package unitocrypt;
import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import static jdk.nashorn.internal.objects.NativeString.substring;
public class UniToCrypt {  
    public static void main(String[] args) throws FileNotFoundException, IOException
	{
            System.out.println("Time in Seconds "+(System.currentTimeMillis()));
            FileInputStream in = new FileInputStream("D:\\Input.txt");
            FileOutputStream out= new FileOutputStream("D:\\Encrypted.txt");
                String everything = "";
		try{
			int i;
			char ch;
			do{
				i=in.read();
				ch=(char)i;
				everything+=ch;
			}while(i!=-1);
		}
                catch(Exception e){}
		char[] k;
                System.out.println(genKey());
             if(everything.length()>30){   
                switch(getRand())
                {
                    case 1:
                        try{
                             everything+="encryp1";
                             k = everything.toCharArray();
                        encryptOne(everything,k,out);
                        }catch(Exception e){}
                        System.out.println("Encrypted Information Successfully 1");
                        break;
                    case 2:
                        try{
                             everything+="encryp2";
                             k = everything.toCharArray();
                        encryptTwo(everything,k,out);
                        }catch(Exception e){}
                         System.out.println("Encrypted Information Successfully 2");
                        break;
                    case 3:
                        try{
                             everything+="encryp3";
                             k = everything.toCharArray();
                        encryptThree(everything,k,out);
                        }catch(Exception e){}
                        System.out.println("Encrypted Information Successfully 3");
                        break;
                }
             }
             else{
                  everything+="encryp1";
                 System.out.println("Default");
                 try{
                     k = everything.toCharArray();
                     encryptOne(everything,k,out);
                 }catch(Exception e){
                     System.out.println("Error ERrod kjlndnd");
                 }
             }
                if(in!=null)
                    in.close();
		if(out!=null)
                    out.close();
              System.out.println("Time in Seconds "+(System.currentTimeMillis()));
	}
    public static void encryptOne(String everything,char[] k,FileOutputStream out) throws IOException
    {
        for(int i=0;i<everything.length();i++)
		{
                     if(i<(everything.length()-7)){  
                        
                        if(i%2==0 && i%3==0)
                        {
                            k[i]+=5;
                            out.write(k[i]);
                        }
                        else if(i%2==0){
                            k[i]+=20;
                            out.write(k[i]);
                        }
                        else if(i%2!=0)
                        {
                            k[i]+=4;
                            out.write(k[i]);
                        }
                    }
                     else
                    {
                        out.write(k[i]);
                    }
		}
    }
    public static void encryptTwo(String everything,char[] k,FileOutputStream out) throws IOException
    {
        for(int i=0;i<everything.length();i++)
		{
                    if(i<(everything.length()-7)){  
                        if(i%2==0 && i%3==0)
                        {
                            k[i]-=9;
                            out.write(k[i]);
                        }
                        else if(i%2==0){
				k[i]-=19;
				out.write(k[i]);
			}
			else if(i%2!=0)
			{
				k[i]-=16;
				out.write(k[i]);
			}
                    }
                    else
                    {
                        out.write(k[i]);
                    }
		}
    }
    public static void encryptThree(String everything,char[] k,FileOutputStream out) throws IOException
    {
        for(int i=0;i<everything.length();i++)
		{
                     if(i<(everything.length()-7)){  
                        if(i%2==0&&i%3==0)
                        {
                            k[i]+=7;
                            out.write(k[i]);
                        }
                        else if(i%2==0){
				k[i]+=12;
				out.write(k[i]);
			}
			else if(i%2!=0)
			{
				k[i]+=5;
				out.write(k[i]);
			}
                     }
                     else
                    {
                        out.write(k[i]);
                    }
                     
		}
    }
    public static int getRand()
    {
        int randomNum = 1+(int)(Math.random()*3); 
        return randomNum;
    }
    public static String genKey()
    {
        char[] rand = new char[20];
        for(int i=0;i<20;i++)
        {
         int randomNum = 65+(int)(Math.random()*109);
         rand[i]=(char)randomNum;
        }
        return rand.toString();
    }
}