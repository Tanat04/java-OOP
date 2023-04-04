package Year1.ClassWork.booksInfo;

public class BookMain {

    public static void main(String[] args) {

        Author author = new Author("Tanat", "tanat.navin", 'M');
        System.out.println(author.toString());
        author.setEmail("you_PeiceOfShit");
        System.out.println(author.toString());
        Author author1 = new Author("handsome", "lets_try", 'F');


        Book book1 = new Book("JavaTime", author1 , 999.45, 234);
        Book book2 = new Book("JavaTime", author , 999.45, 234);
        System.out.println(book1.toString());
        System.out.println(book2.getAuthor());

    }
}
