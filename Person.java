public class Person {  private string name;  private int age; 
 
 
 public void setName(String name) throws IllegalArguementException  {   if(name.isEmpty())    throw new IllegalArguementException(“Cant pass empty first name”);   this.name = name;  } }

 public Person(String name,int age)  {   this.name = name; 
  this.age = age;  } 
 
 public void setName(String name)  {   this.name = name;  } }

