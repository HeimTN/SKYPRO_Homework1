package objectclasshw12;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publishYear;

    public Book(String name, Author author, int year){
        this.name = name;
        this.author = author;
        this.publishYear = year;
    }

    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public int getPublishYear(){
        return publishYear;
    }
    public void setPublishYear(int year){
        publishYear = year;
    }
    public String toString(){
        return "Книга "+getName()+" написанная в "+getPublishYear()+" году автором "+getAuthor().toString();
    }
    public boolean equals(Book anotherBook){
        return getAuthor().equals(anotherBook.getAuthor()) && getName().equals(anotherBook.getName())
                && getPublishYear() == anotherBook.getPublishYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getPublishYear());
    }
}
