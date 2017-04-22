//Anit Jyotishi
//L20404856
//Assignment 1
import java.util.*;
import java.lang.*;
class Sampling
{
	//This method performs random sampling with replacement.
	void randomSampling(int no_of_records,ArrayList a)
	{
		ArrayList <String> final_randon_sampled = new ArrayList<String>();
		System.out.println("This is Random Sampling with replacement.");
		Random r = new Random();
		int sample_size =  (no_of_records*10)/100;//A sample of size 10%.
		int x[] = new int[sample_size];
		System.out.println("The no of records in input file is: "+no_of_records + ".");
		System.out.println("No. of records with size 10% of the original size is: " +sample_size + ".");
		for (int i=0;i<=sample_size-1;i++)
		{
			x[i]= r.nextInt(sample_size - 1);//An array of all the generated random numbers.
		}
		System.out.println("Randomly Sampled records at 10% (with replacement) are as follows: ");
		for (int i=0;i<=sample_size-1;i++)
		{
			//Printing all the randomly sampled records.
			System.out.println("The value of x,y and c respectively are " + a.get(x[i]) + " which is the record no. " + x[i] + " (random no.) in our input file.");
			//final_randon_sampled.add(a.get(x[i]));
		}
		System.out.println("---------------------------------------");
	}
	
	
	//This method performs stratified sampling.
	void stratifiedSampling(int no_of_records,ArrayList a)
	{
		System.out.println("This is stratified sampling");
		ArrayList <Integer> random_nos = new ArrayList<Integer>();
		ArrayList <Record> final_sampled = new ArrayList<Record>();//Finally sampled records would be here.
		Random r = new Random();
		ArrayList<Record> record_objects_ArrayList = new ArrayList<Record>();//This is an ArrayList of all the records from the input file.
		record_objects_ArrayList = make_arraylist_of_record_objects(no_of_records,a);
		
		//Declaring an ArrayList for each type of record.
		ArrayList<Record> type0 = new ArrayList<Record>();
		ArrayList<Record> type1 = new ArrayList<Record>();
		ArrayList<Record> type2 = new ArrayList<Record>();
		ArrayList<Record> type3 = new ArrayList<Record>();
		ArrayList<Record> type4 = new ArrayList<Record>();
		ArrayList<Record> type5 = new ArrayList<Record>();
		ArrayList<Record> type6 = new ArrayList<Record>();
		ArrayList<Record> type7 = new ArrayList<Record>();
		ArrayList<Record> type8 = new ArrayList<Record>();
		
		for(int i=0;i<=no_of_records -1;i++) //nested if-else inside a for loop to segregate records according to type.
		{
			if ((record_objects_ArrayList.get(i)).c == 0)
			{
				
				type0.add(record_objects_ArrayList.get(i));
				
			}
			
			else if ((record_objects_ArrayList.get(i)).c == 1)
			{
				type1.add(record_objects_ArrayList.get(i));
				
			}
			
			else if ((record_objects_ArrayList.get(i)).c == 2)
			{
				type2.add(record_objects_ArrayList.get(i));
				
			}
			
			else if ((record_objects_ArrayList.get(i)).c == 3)
			{
				
				type3.add(record_objects_ArrayList.get(i));
			}
			
			else if ((record_objects_ArrayList.get(i)).c == 4)
			{
				type4.add(record_objects_ArrayList.get(i));
				
			}
			
			else if ((record_objects_ArrayList.get(i)).c == 5)
			{
				type5.add(record_objects_ArrayList.get(i));
				
			}
			
			else if ((record_objects_ArrayList.get(i)).c == 6)
			{
				type6.add(record_objects_ArrayList.get(i));
				
			}
			
			else if ((record_objects_ArrayList.get(i)).c == 7)
			{
				type7.add(record_objects_ArrayList.get(i));
				
			}
			
			else if ((record_objects_ArrayList.get(i)).c == 8)
			{
				type8.add(record_objects_ArrayList.get(i));
				
			}			
		} // end of for loop
		
		int no_of_type0_records = type0.size();
		int no_of_type1_records = type1.size();
		int no_of_type2_records = type2.size();
		int no_of_type3_records = type3.size();
		int no_of_type4_records = type4.size();
		int no_of_type5_records = type5.size();
		int no_of_type6_records = type6.size();
		int no_of_type7_records = type7.size();
		int no_of_type8_records = type8.size();
		
		//These nine for loops make nine ArrayLists for each of the nine classes from 0 to 8.
		for(int i=0;i<=((10*no_of_type0_records)/100)-1;i++)
		{
			int d = r.nextInt(no_of_type0_records - 1);
			final_sampled.add(type0.get(d));
			random_nos.add(d);
			
		}
		
		
		
		for(int i=0;i<=((10*no_of_type1_records)/100)-1;i++)
		{
			int d = r.nextInt(no_of_type1_records - 1);
			final_sampled.add(type1.get(d));
			random_nos.add(d);
		}

		for(int i=0;i<=((10*no_of_type2_records)/100)-1;i++)
		{
			int d = r.nextInt(no_of_type2_records - 1);
			final_sampled.add(type2.get(d));
			random_nos.add(d);
		}

		for(int i=0;i<=((10*no_of_type3_records)/100)-1;i++)
		{
			int d = r.nextInt(no_of_type3_records - 1);
			final_sampled.add(type3.get(d));
			random_nos.add(d);
		}
		
		for(int i=0;i<=((10*no_of_type4_records)/100)-1;i++)
		{
			int d = r.nextInt(no_of_type4_records - 1);
			final_sampled.add(type4.get(d));
			random_nos.add(d);
		}
		
		for(int i=0;i<=((10*no_of_type5_records)/100)-1;i++)
		{
			int d = r.nextInt(no_of_type5_records - 1);
			final_sampled.add(type5.get(d));
			random_nos.add(d);
		}
		
		for(int i=0;i<=((10*no_of_type6_records)/100)-1;i++)
		{
			int d = r.nextInt(no_of_type6_records - 1);
			final_sampled.add(type6.get(d));
			random_nos.add(d);
		}

		for(int i=0;i<=((10*no_of_type7_records)/100)-1;i++)
		{
			int d = r.nextInt(no_of_type7_records - 1);
			final_sampled.add(type7.get(d));
			random_nos.add(d);
		}
 
		for(int i=0;i<=((10*no_of_type8_records)/100)-1;i++)
		{
			int d = r.nextInt(no_of_type8_records - 1);
			final_sampled.add(type8.get(d));
			random_nos.add(d);
		}

		System.out.println("Size of stratified sample is " +final_sampled.size());
		
		
		//Printing of the records which have been sampled by stratified sampling.
		//for(int i = 0; i<=((10 * no_of_records)/100)-1;i++)
		if (final_sampled.size() == random_nos.size())//Further check to ensure that random number we have is correct.
				{
					for(int i = 0; i<=final_sampled.size()-1;i++)
					{
						System.out.println("value of x is " + (final_sampled.get(i).x) + " value of y is " + (final_sampled.get(i).y) + " value of c is " +(final_sampled.get(i).c) + " with random no value "+random_nos.get(i)); ;
					}
				}
	}
	
	//This method takes records in the form of a String ArrayList and returns an ArrayList of objects of type Record. 
	ArrayList<Record> make_arraylist_of_record_objects(int no_of_records,ArrayList a)
	{
		ArrayList<Record> record_objects_ArrayList = new ArrayList<Record>();
		for(int i=0;i<=no_of_records -1;i++)
		{
		String temp = (String) a.get(i);
		int index_of_first_comma = temp.indexOf(",");
		int index_of_last_comma = temp.lastIndexOf(",");
		String string_value_of_x = temp.substring(0,index_of_first_comma );
		String string_value_of_y = temp.substring(index_of_first_comma + 1,index_of_last_comma);
		String string_value_of_c = temp.substring(index_of_last_comma + 1);
		int integer_value_of_c = Integer.parseInt(string_value_of_c);
		double double_value_of_x = Double.parseDouble(string_value_of_x);
		double double_value_of_y = Double.parseDouble(string_value_of_y);
		//Each object of the record class denotes each record in our input file.
		record_objects_ArrayList.add(new Record(double_value_of_x,double_value_of_y,integer_value_of_c));
		}
		return record_objects_ArrayList;
	}
	
}

