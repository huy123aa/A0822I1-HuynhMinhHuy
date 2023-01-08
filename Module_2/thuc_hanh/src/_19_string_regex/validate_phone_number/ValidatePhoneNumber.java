package _19_string_regex.validate_phone_number;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        String phoneNum1 = "(84)-(0978489648)";
        String phoneNum2 = "(a8)-(22222222)";
        System.out.println(phoneNum1.matches(regex));
        System.out.println(phoneNum2.matches(regex));
    }
}
