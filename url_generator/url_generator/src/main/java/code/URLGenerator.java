//package code;
//
//import org.springframework.stereotype.Component;
//
//import java.util.Random;
//
//@Component
//public class URLGenerator {
//    public static String generateNewUrl(){
//        return generateRandomString();
//    }
//
//    public static String generateRandomString(){
//        String chars = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+=}{:;?/|>.<,";
//        Random random = new Random();
//
//        StringBuilder authToken = new StringBuilder();
//
//        for (int i = 0; i < 200; i++) {
//            authToken.append(chars.charAt(random.nextInt(chars.length())));
//        }
//
//        return authToken.toString();
//    }
//}
