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
               
     	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$DECRYPTION$$$$$$$$$$$$$
    	$$$$$$$$$$$$$$$$$$$$$$$ DECRYPTION ALGORITHM  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	$$$$$$$$DECRYPTION$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
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
        ########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	##############################################################################
    }
    public static void decryptTwo(String everything,char[] k,FileOutputStream out) throws IOException
    {
            ########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	##############################################################################
    }
    public static void decryptThree(String everything,char[] k,FileOutputStream out) throws IOException
    {
	    
        ########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	##############################################################################
    }
}
