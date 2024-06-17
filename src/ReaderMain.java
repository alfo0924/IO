import java.util.Scanner;
import java.io.*;
public class ReaderMain

{
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("請輸入暫存檔名 :");
            String fileName=br.readLine();
            System.out.println("File Name : "+ fileName);

            BufferedReader fbr=new BufferedReader(new FileReader(fileName));
            String line="";
            while((line=fbr.readLine())!= null)
            {
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println("Error :" +e.getMessage());

        }
    }
}
