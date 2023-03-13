package objectclasshw12;

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
}
