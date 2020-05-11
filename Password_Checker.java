public class Password_Checker {
//    It has at least 6 characters and at most 20 characters.
//    It must contain at least one lowercase letter,
//    at least one uppercase letter, and at least one digit.
//    It must NOT contain three repeating characters in a row
//    ("...aaa..." is weak, but "...aa...a..." is strong, assuming other conditions are met).

    public static void main(String [] args){
        String s = "12345678901234567890";
        if(s.length() <= 6 || s.length() <= 20)
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
}
