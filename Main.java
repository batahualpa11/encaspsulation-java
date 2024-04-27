
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
    myObj.name = "John";  // error // we get an error here because the variable name is 
    System.out.println(myObj.name); // error 
  }
}

public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}
  
  // Outputs "John"

