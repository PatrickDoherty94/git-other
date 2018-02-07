public class Person {  private string name; 
 
 public Person(String name)  {   this.setName(name);  } 
 
 public void setName(String name) throws IllegalArguementException  {   if(name.isEmpty())    throw new IllegalArguementException(“Cant pass empty first name”);   this.name = name;  } }