package objectclasshw12;

import java.util.Objects;

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
    public String toString(){
        return getFirstName()+" "+getLastName();
    }
    public boolean equals(Author anotherAuthor){
        return getFirstName().equals(anotherAuthor.getFirstName()) && getLastName().equals(anotherAuthor.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
