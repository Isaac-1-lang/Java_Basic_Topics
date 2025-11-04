package keys;

public class EmailRegex {
    public static void main(String[] args) {
        String email = "isaac@gmail.com";
        boolean isValid = email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
        System.out.println(isValid); // true
        String name = "NIYOBYOSE Isaac";
        boolean result = name.matches("NIYOBYOSE Isaac");
        System.out.println(result);
    }
}
