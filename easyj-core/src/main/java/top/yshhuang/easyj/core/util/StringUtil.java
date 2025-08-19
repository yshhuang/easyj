package top.yshhuang.easyj.core.util;

import java.util.Random;

public class StringUtil {
    private static final int DEFAULE_RANDOM_LENGTH = 16;
    private static final String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";
    private static final String numbers = "0123456789";
    private static final String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers;

    public static String randomString() {
        return randomString(DEFAULE_RANDOM_LENGTH);
    }

    public static String randomString(int length) {
        StringBuffer randomString = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();
    }
}
