package az.budaqli;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[+]{0,1}994(10|50|51|55|70|77|99)\\d{7}$");
        Matcher matcher = pattern.matcher("+994556429058");
        System.out.println(matcher.matches());
    }
}