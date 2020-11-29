package core_java.Collections.Maps;
import java.util.*;

public class HashMapDemo {

	public static void main(String args[])
	{
	HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);
      hm.put(102,"Rahul");  //put() which inserts the values
      hm.put(100,"Amit");    
      hm.put(101,"Vijay"); 
      hm.put(104,"Deepti"); 
   
      System.out.println("After invoking put() method ");  
     
      //every key-value pair is called an entry
      
      for(Map.Entry m: hm.entrySet()) //set of entries : key-value pair
      {    
       System.out.println(m.getKey()+"- "+m.getValue());    
      }  
        
      
      hm.putIfAbsent(103, "Gaurav"); //insert if not present already 
      System.out.println("After invoking putIfAbsent() method ");  
      
      for(Map.Entry m:hm.entrySet())
      {    
           System.out.println(m.getKey()+" "+m.getValue());    
      }  
      
      HashMap<Integer,String> map=new HashMap<Integer,String>();  
      map.put(114,"Ravi"); 
      
      map.putAll(hm);  //copies one map values to another
      System.out.println("After invoking putAll() method ");  
      for(Map.Entry m:map.entrySet())
      {    
           System.out.println(m.getKey()+" "+m.getValue());    
          } 
      
    //key-based removal  
      map.remove(100);  
      System.out.println("Updated list of elements: "+map); 
      
      //key-value pair based removal  
      map.remove(102, "Rahul");  
      System.out.println("Updated list of elements: "+map);  
 }  
}

