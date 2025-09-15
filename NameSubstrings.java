import java.util.Scanner;
import java.io.*;



public class NameSubstrings {
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the name of the input file \n");
        String inputFileName = keyboard.next();
        File inputFile = new File (inputFileName);
        if(!inputFile.exists())//closes program if named file is not found
        {
            System.out.printf("Input File %s not found\n", inputFileName);
            System.exit(0);
        }
        System.out.printf("Please enter the name of the output file: \n");
        String outputFileName = keyboard.next();
        File outputFile = new File (outputFileName);
        
        //file set up for reading/writing
        Scanner fileScanner = new Scanner (inputFile);
        PrintWriter output = new PrintWriter(outputFile);

        //creates an array that can hold 100 names
        String[] lastNames = new String [100];
        int count = 0;

        while (fileScanner.hasNextLine() && count<100){
            String line = fileScanner.nextLine();
            String[] tokens = line.split("\\s+");//splits lines into names
            for (String name : tokens) {
                if (count<100){
                    lastNames[count]=name;
                    count++;
                }
            }
        }

        //lastNames going into noFirst
        String[] outputtedNames = noFirst(lastNames, count);

        //outputtedNames into output file
        for (int i=0; i<count; i++) {
            output.printf("%s\n", outputtedNames[i]);
        }

        fileScanner.close();
        output.close();
        keyboard.close();
    }
    public static String[] noFirst(String[] lastNames, int count)
    {
        String[] output = new String[count];
        for (int i=0; i<count; i++)
        {
            output[i]=lastNames[i].substring(1);
        }
        return output;
    }
}