package core_java.Basic_OOPS;

class Terrestrial extends Animals 
{ 
    // constructor 
    Terrestrial(String name) 
    { 
        super(name);
    } 
    
    public void basicDetails(String details) //concrete method
    { 
    	System.out.println("---terrestrial----"); 
        System.out.println(name + " " + details); 
    }
    
  /*  public void habitat()  
    { 
        System.out.println("live on land");  
    } 
       
    public void respiration()  
    { 
        System.out.println("respire through lungs or trachea");  
    }*/
}