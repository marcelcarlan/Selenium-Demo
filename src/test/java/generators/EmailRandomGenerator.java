package generators;

public class EmailRandomGenerator {

    private RandomStringGenerator randomStringGenerator = new RandomStringGenerator();

    public static String valid() {
        return RandomStringGenerator.randomAlphabetic(11).toLowerCase()
                + "@"
                + "gmail"
                + ".com";
    }

    public static String nonValid() {
        return "@#$%^&*()_)(*&^%"
                + "@"
                + "@#$%^&*()_)(*&^%";
    }

}
