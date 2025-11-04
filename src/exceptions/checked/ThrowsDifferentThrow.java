package exceptions.checked;

public class ThrowsDifferentThrow {
    public void checkAge(int age) throws Exception {
        if(age <18) {
            throw new Exception("You are not allowed to perform this action");
        }
        System.out.println("Action performed successfully");
    }
}
