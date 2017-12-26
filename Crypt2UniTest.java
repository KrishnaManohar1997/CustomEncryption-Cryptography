package crypttouni;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;
public class CryptToUni {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream in = new FileInputStream("D:\\Encrypted.txt");
            FileOutputStream out= new FileOutputStream("D:\\Decrypted.txt");
         String everything="";
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
                k = everything.toCharArray();
                 System.out.println(" this is everything"+everything);
                   String check=null,check1="encryp1",check2="encryp2",check3="encryp3";
                   check= everything.substring(everything.length()-8,everything.length()-1);
                    System.out.println("Check values "+check);
                    if(check.equals(check1))
                    {
                           System.out.println("Phase 1 True");
                           decryptOne(everything,k,out);
                    }
                    else if(check.equals(check2))
                    {
                           System.out.println("Phase 2");
                           decryptTwo(everything,k,out);
                    }
                    else if(check.equals(check3))
                    {
                           System.out.println("Phase 3");
                           decryptThree(everything,k,out);
                    }  
                    else{
                        System.out.println("Default");
                           decryptOne(everything,k,out);
                    }
                if(in!=null)
                    in.close();
		if(out!=null)
                    out.close();
    }
    public static void decryptOne(String everything,char[] k,FileOutputStream out) throws IOException
    {
         for(int i=0;i<everything.length()-9;i++)
		{
                   
                    if(i%2==0 && i%3==0)
                        {
                            k[i]-=5;
                            out.write(k[i]);
                        }
                        else if(i%2==0){
				k[i]-=20;
				out.write(k[i]);
			}
			else if(i%2!=0)
			{
				k[i]-=4;
				out.write(k[i]);
			}
		}
    }
    public static void decryptTwo(String everything,char[] k,FileOutputStream out) throws IOException
    {
            for(int i=0;i<everything.length()-9;i++)
		{
                    if(i%2==0 && i%3==0)
                        {
                            k[i]+=9;
                            out.write(k[i]);
                        }
                        else if(i%2==0){
				k[i]+=19;
				out.write(k[i]);
			}
			else if(i%2!=0)
			{
				k[i]+=16;
				out.write(k[i]);
			}
		}
    }
    public static void decryptThree(String everything,char[] k,FileOutputStream out) throws IOException
    {
        for(int i=0;i<everything.length()-9;i++)
		{
                     if(i%2==0&&i%3==0)
                        {
                            k[i]-=7;
                            out.write(k[i]);
                        }
                        else if(i%2==0){
				k[i]-=12;
				out.write(k[i]);
			}
			else if(i%2!=0)
			{
				k[i]-=5;
				out.write(k[i]);
			}
		}
    }
}