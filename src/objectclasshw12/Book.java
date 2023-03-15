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
    @Override
    public String toString(){
        return "Книга "+getName()+" написанная в "+getPublishYear()+" году автором "+getAuthor().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getPublishYear() == book.getPublishYear() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getPublishYear());
    }
}
