package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Hashmaxpex {

	public static void main(String[] args) 
	{
		//declare Hashmap
		HashMap<Integer,String> x=new HashMap<Integer,String>();
		
		//store values in Hashmap
		
		x.put(100,"batch239");
		x.put(101,"batch240");
		x.put(102,"mindq");
		
		//change existing value depending on key value
		
		x.put(102,"mindqvijayawada");
		
		//change the key
		x.put(103,x.remove(102));
		
		// get pairs  of data
		for(Map.Entry<Integer,String> e:x.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		
	}

}
