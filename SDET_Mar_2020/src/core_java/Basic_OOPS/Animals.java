package core_java.Basic_OOPS;

public abstract class Animals
{
	        String name = " "; 
	      
	        Animals(String name) 
	        { 
	            this.name = name; 
	            System.out.println("Inside parent class constructor : Animals");
	        } 
	           
	        // declare non-abstract methods 
	        // it has default implementation 
	        public void basicDetails(String details) //concrete method
	        { 
	            System.out.println(name + " " + details); 
	        } 
	           
	        // abstract methods which will be implemented by its subclass(es) 
	        
	        abstract public void habitat();//abstract //method signatures
	        
	        abstract public void respiration(); 
	    } 


