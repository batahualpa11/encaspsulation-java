
public class Person {
  private String name; // private = restricted access
  
  // Getter 
  public String getName() {  //(get method)
    return name;
  }
  
  // Setter 
  public void setName(String newName) {  // (Set method)
    this.name = newName;
  }
}

public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John";  // error // we get an error here because the variable name is declared as private 
    System.out.println(myObj.name); // error // we also get an error here because the name is still declared as private 
  }
}

public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John" // here we don't get any errors because it uses the public "set method" even though it is still declared private  
    System.out.println(myObj.getName()); // here you can see we use the "get method" to then print the name "john" 
  }
}
  
  // Outputs "John"

