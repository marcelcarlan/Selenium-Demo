package generators;

public class PasswordRandomGenerator {

    private RandomStringGenerator randomStringGenerator = new RandomStringGenerator();

    public static String valid() {
        return RandomStringGenerator.randomAlphaNumeric(7)+"@";
    }

    public static String nonValid() {
        return RandomStringGenerator.randomAlphaNumeric(4);
    }

}
