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
                            
                             k = everything.toCharArray();
                        encryptOne(everything,k,out);
                        }catch(Exception e){}
                        System.out.println("Encrypted Information Successfully 1");
                        break;
                    case 2:
                        try{
                             k = everything.toCharArray();
                        encryptTwo(everything,k,out);
                        }catch(Exception e){}
                         System.out.println("Encrypted Information Successfully 2");
                        break;
                    case 3:
                        try{
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
                     System.out.println("Error ");
                 }
             }
                if(in!=null)
                    in.close();
		if(out!=null)
                    out.close();
              System.out.println("Time in Seconds "+(System.currentTimeMillis()));
	}
	
	
	$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ENCRYPTION$$$$$$$$$$$
    	$$$$$$$$$$$$$$$$$$$$$$$ ENCRYPTION ALGORITHM  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	$$$$$$$$ENCRYPTION$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
		
    public static void encryptOne(String everything,char[] k,FileOutputStream out) throws IOException
    {
         ########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
##############################################################################
    }
    public static void encryptTwo(String everything,char[] k,FileOutputStream out) throws IOException
    {
        ########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
##############################################################################
    }
    public static void encryptThree(String everything,char[] k,FileOutputStream out) throws IOException
    {
         ########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
##############################################################################
    }
    public static int getRand()
    {
        int randomNum = 1+(int)(Math.random()*3); 
        return randomNum;
    }
    public static String genKey()
    {
         ########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
##############################################################################
    }
}
