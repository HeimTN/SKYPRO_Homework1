package objectclasshw12;

public class Homework12 {
    public static void main(){
        Author pushkin = new Author("Aleksandr","Pushkin");
        Author gogol = new Author("Nikolai","Gogol");
        Book evgeniOnegin = new Book("Evgeni Onegin",pushkin,1823);
        Book deadSoul = new Book("Dead Soul",gogol,1842);
        deadSoul.setPublishYear(1831);
        Book blackMan = new Book("Black Man",new Author("Sergei","Esenin"),1926);
    }
}
