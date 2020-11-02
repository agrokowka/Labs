package Lab1;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Титан", "Теодор Драйзер", 600);

        b1.setAuthor("Тургенев Иван Сергеевич");
        b1.setName("Отцы и дети");
        b1.setPages(250);

        System.out.println(b1);
        System.out.println(b2);
    }
}
