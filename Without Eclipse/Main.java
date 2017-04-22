//Anit Jyotishi
//L20404856
//Assignment 1
import java.io.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		try
		{//
		

		File file = new File("output.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		
		}//
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		FileReader fin = null;
		FileWriter fout = null;
		ArrayList <String> a = new ArrayList<String> ();
		int no_of_records;
		Sampling u = new Sampling();//An object of Sampling class.
		try
		{
			fin = new FileReader("Complex9_GN8.txt");
			BufferedReader br = new BufferedReader (fin);
			String line = null;
		    while ((line = br.readLine()) != null)
		    {
		    	a.add(line);//Reading each record in input file into ArrayList a.
		    }
		    no_of_records = a.size();//The size of the ArrayList would be the number of records we have.
		    u.randomSampling(no_of_records, a);
		    u.stratifiedSampling(no_of_records, a);
		    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}