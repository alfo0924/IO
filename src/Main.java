package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please input file name:");
            String filename = br.readLine();
            System.out.println("File name: " + filename);

            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter bw=new BufferedWriter(fileWriter);
            bw.write("Hello FCU!!");
            bw.newLine();
            bw.write("I like java !");
            bw.flush();
            bw.close();

//            fileWriter.write("Hello FCu");
//            fileWriter.flush();
//            fileWriter.close();
            System.out.println("File created successfully.");
        } catch(IOException ioe) {
            System.out.println("An error occurred while processing the file:");
            ioe.printStackTrace(); // Print stack trace for detailed error analysis
        }
    }
}
