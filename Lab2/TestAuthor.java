public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Lev Tolstoy","lev.tolstoy@gmail.com", 'm');
        Author a2 = new Author("Sergey Esenin", "esenin.s@yandex.ru", 'm');

        System.out.println(a2.getEmail());
        a2.setEmail("sergey.esenin@mail.ru");
        System.out.println(a1);
        System.out.println(a2);
    }
}
