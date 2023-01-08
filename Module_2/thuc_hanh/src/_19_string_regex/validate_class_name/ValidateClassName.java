package _19_string_regex.validate_class_name;

public class ValidateClassName {
    public static void main(String[] args) {
        String regex = "^[CAP]\\d{4}[GHIKLM]$";
        String name1 = "C0318G";
        String name2 = "M0318G";
        String name3 = "P0323A";
        System.out.println(name1.matches(regex));
        System.out.println(name2.matches(regex));
        System.out.println(name3.matches(regex));
    }
}
