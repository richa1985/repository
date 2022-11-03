package mavenprojectday1;

import java.util.HashMap;
import java.util.Map;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm= new HashMap<Integer, String>();
		hm.put(10, "richa");
		//System.out.println(hm);
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
			
		}
			
		

	}

}
