package utils;

import java.util.Random;

public class StringUtil {

    public static final String EMAIL_PREFIX = "@gotham.com";
    public static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    public static final String SIGNS = "*/-+!@#$%^&*()_+";
    public static final String NUMBERS = "1234567890";

    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        while (sb.length() < length) {
            int index = (int) (random.nextFloat() * CHARS.length());
            sb.append(CHARS.charAt(index));
        }
        return sb.toString();
    }

    public static String getRandomSign(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        while (sb.length() < length) {
            int index = (int) (random.nextFloat() * SIGNS.length());
            sb.append(SIGNS.charAt(index));
        }
        return sb.toString();
    }

    public static String getRandomNumber(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        while (sb.length() < length) {
            int index = (int) (random.nextFloat() * NUMBERS.length());
            sb.append(NUMBERS.charAt(index));
        }
        return sb.toString();
    }

    public static String generateRandomEmail() {
        int emailLength = 10;
        return getRandomString(emailLength) + EMAIL_PREFIX;
    }

    public static String generateRandomPassword() {
        int passwordLength = 8;
        int signLength = 3;
        return getRandomString(passwordLength) + getRandomSign(signLength);
    }

    public static String generateRandomName() {
        int passwordLength = 5;
        int signLength = 3;
        return getRandomString(passwordLength) + getRandomSign(signLength);
    }

    public static String generateRandomTelephone() {
        int telephoneLength = 10;
        return getRandomNumber(telephoneLength);
    }

    public static int generateRandomNum() {
        Random r = new Random();
        int low = 0;
        int high = 2;
        return r.nextInt(high - low) + low;
    }
}