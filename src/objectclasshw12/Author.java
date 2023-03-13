package objectclasshw12;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
