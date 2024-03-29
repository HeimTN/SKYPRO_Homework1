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
    @Override
    public String toString(){
        return getFirstName()+" "+getLastName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(getFirstName(), author.getFirstName()) && Objects.equals(getLastName(), author.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
