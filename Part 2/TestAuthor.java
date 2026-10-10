public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author(
            "Anna Ivanova",
            "anna@mail.com",
            'F'
        );

        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        System.out.println(author.toString());

        author.setEmail("newanna@mail.com");

        System.out.println("После изменения email:");
        System.out.println(author.toString());
    }
}







