package core_java.Lab_Solutions.Lab12;

import java.util.ArrayList;
import java.util.List;

public class JoinLists 
	{
	    public static void main(String[] args)
	    {
	        List<String> list1 = new ArrayList<String>();
	        list1.add("First");
	        list1.add("Fluffy");
	        List<String> list2 = new ArrayList<String>();
	        list2.add("Second");
	        list2.add("Smart");
	       // List<String> joined = new ArrayList<String>();
	        
	      /*  joined.addAll(list1);
	        joined.addAll(list2);*/
	        list1.addAll(list2);
	        
	        System.out.println("list1: " + list1);
	        System.out.println("list2: " + list2);
	        //System.out.println("joined: " + joined);
	    }
	}

