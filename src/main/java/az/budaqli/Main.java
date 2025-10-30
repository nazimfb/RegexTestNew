package az.budaqli;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //so its the number format
        Pattern number = Pattern.compile("^[+]?994(10|50|51|55|70|77|99)\\d{7}$");
        Matcher matcher = number.matcher("+994556429058");
        System.out.println(matcher.matches());
        // and this is the email pattern-
        Pattern email = Pattern.compile("^[\\w-.]{1,49}@([\\w-]+\\.){2,5}.[a-zA-Z]{2,4}$");
        matcher = email.matcher("nazim-.budaqlIII@-out-look.rtr.turk");
        System.out.println(matcher.matches());

    }
}