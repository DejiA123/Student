package ie.gmit;

public class Student {

    private String name;     // name
    private String email;      // email


  public Student(String name, String email)
  {
     this.name = name;
     this.email = email;
  }


    public String getName() {
      return name;
    }

    public String getEmail() {
        return email;
    }
}
