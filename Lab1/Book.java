package Lab1;

public class Book {
    private String name;
    private String author;
    private int pages;

    public Book(String n, String a, int p){
        name = n;
        author = a;
        pages = p;
    }
    public Book(){
        name = "No name";
        author = "No author";
        pages = 0;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public String toString(){
        return "Книга " + this.name + ", написал " + author + ", страниц " + pages;
    }
}
