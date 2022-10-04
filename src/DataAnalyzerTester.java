package q3;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

/**
 Client class for DataAnalyzer.
 */
public class DataAnalyzerTester {
    public static void main(String[] args) {
        try {
            String filename = args[0];
            LinkedList<Integer> numList = new LinkedList<Integer>();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a sequence of integers separated by spaces:");
            String numbers = in.nextLine();
            String[] splitnum = numbers.split("\\s+");

            for(int i = 0; i < splitnum.length; i++) {
                String stringnum = splitnum[i];
                numList.add(Integer.parseInt(stringnum));
            }
            in.close();

            DataAnalyzer da = new DataAnalyzer(numList);
            // validate and create file
            File f = new File(filename);
            f.createNewFile();
            FileWriter myWriter = new FileWriter(filename);
            for (int i = 0; i < numList.size(); i++) {
                myWriter.write(numList.get(i) + " ");
            }
            myWriter.write(System.lineSeparator());
            myWriter.write("Min: " + da.min() + " Max: " + da.max() + " Average: " + da.average());
            myWriter.close();
            System.out.println("Min: " + da.min() + " Max: " + da.max() + " Average: " + da.average());
        } catch (IOException e) {
            System.out.println("Error, invalid filename!");
            System.exit(1);
        } catch (NumberFormatException e) {
            System.out.println("Error, must enter integers!");
            System.exit(1);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error, must pass a filename!");
            System.exit(1);
        }
    }
}
