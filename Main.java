import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

class Main {
  public static void main(String[] args) throws IOException //need to add IOException for files
  {
    
    String token = "";
    File fileName = new File("Hail.txt");
    Scanner inputFile = new Scanner(fileName);

    int count = 0;
    while(inputFile.hasNext()) //use while loop to read tokens from the file Hail.txt
    {
      token = inputFile.next(); //procress all tokens in text file
      System.out.println(token); //print the tokens
      count++;
    }
    inputFile.close(); //when you are done reading input file (aka when this while loop goes false) you want to close the file. otherwise, you will have to create a new scanner for another file, and running two scanners at once can become problematic depending on the file contents.
    System.out.println("The number of tokens in Hail.txt is " + count + "\n");

    Scanner inputFile2 = new Scanner(fileName); //new Scanner
    String[] hail = new String[count]; //using same file but storing info in a String array
    int index = 0;
    while(inputFile2.hasNext())
    {
      hail[index] = inputFile2.next();
      index++;
    }
    inputFile2.close();
    for(String i : hail)
    {
      System.out.println(i);
    }

    //read HailCommas.txt file with comma delimiter
    File fileName3 = new File("HailCommas.txt");
    Scanner inputFile3 = new Scanner(fileName3).useDelimiter(","); //inserting a commma between each token to seperate them
    while(inputFile3.hasNext()) //use while loop to read tokens from the file Hail.txt. you can use different things
    {
      token = inputFile3.next(); 
      System.out.println(token);
    }
    //read integers.txt file and calculate an average
    File fileName4 = new File("integers.txt");
    Scanner inputFile4 = new Scanner(fileName4);
    double average = 0.0;
    double sum = 0; //accumulater
    int count4 = 0;
    while(inputFile4.hasNext())
    {
      sum+= inputFile4.nextInt();
      count4++;
    }
    inputFile4.close();
    System.out.println("Average = " + (sum/count4));

    //writing to an output file
    File fileName5 = new File("hello.txt");
    PrintWriter outFile = new PrintWriter(fileName5);
    for (int loop = 1; loop <= 10; loop++)
    {
      outFile.println(loop + " Hello, World!");
    } //end for loop
    outFile.close( ); //close the file when finished

    //read int commas, caculate average, write to output file
    //in one loop
    File fileName6 = new File("intCommas.txt");
    File fileName66 = new File("intCommasAvg.txt");
    Scanner inputFile6 = new Scanner(fileName6).useDelimiter(",");
    PrintWriter outFile6 = new PrintWriter(fileName66);
    double sum6 = 0;
    int count6 = 0;
    while(inputFile6.hasNextInt())
    {
      sum6 += inputFile6.nextInt();
      count6++;
    }
    inputFile6.close();
    outFile6.println("Average = " + (sum6/count6));
    outFile6.close();





  }
}