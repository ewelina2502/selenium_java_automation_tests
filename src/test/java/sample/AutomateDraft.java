package sample;

public class AutomateDraft {

    public static void main(String[] args) {


        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();
        String email = faker.name().firstName().substring(0, 4).toLowerCase() + "." + faker.name().lastName().substring(0,5).toLowerCase() + "@email.com";
        System.out.println(email);

    }

}
