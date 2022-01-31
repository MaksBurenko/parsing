package parsing;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String s = "A Java program is mostly a collection of objects talking to other objects"
                + "by invoking each other's methods. Every object is of a certain type,"
                + "and that type is defined by a class or an interface. Most Java programs"
                + "use a collection of objects of many different types.";
        String [] array = s.split("\\. ");
        for (String temp : array) {
            if (temp.endsWith(".")) {
                System.out.println(temp);
            } else {
                System.out.println(temp + ".");
            }
        }
        Pattern p = Pattern.compile("^A | A | a ");
        Matcher m = p.matcher (s);
        while (m.find()){
            System.out.println(m.start() + " " + m.group());
        }
    }
}
