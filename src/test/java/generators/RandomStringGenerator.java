package generators;

import org.apache.commons.text.CharacterPredicates;

public class RandomStringGenerator {

    public static String randomAlphabetic(int length){
        org.apache.commons.text.RandomStringGenerator randomStringGenerator =
                new org.apache.commons.text.RandomStringGenerator.Builder()
                        .withinRange('A', 'z')
                        .filteredBy(CharacterPredicates.LETTERS)
                        .build();
        return randomStringGenerator.generate(length);
    }

    public static String randomAlphaNumeric(int length){
        org.apache.commons.text.RandomStringGenerator randomStringGenerator =
                new org.apache.commons.text.RandomStringGenerator.Builder()
                        .withinRange('0', 'z')
                        .filteredBy(CharacterPredicates.LETTERS, CharacterPredicates.DIGITS)
                        .build();
        return randomStringGenerator.generate(length);
    }

}
