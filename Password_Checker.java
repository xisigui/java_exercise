public class Password_Checker {
//    It has at least 6 characters and at most 20 characters. X
//    It must contain at least one lowercase letter, X
//    at least one uppercase letter, and at least one digit.
//    It must NOT contain three repeating characters in a row
//    ("...aaa..." is weak, but "...aa...a..." is strong, assuming other conditions are met).

    public static void main(String args[]){
                String s = "Aaaa123a";//12345678901234567890
                boolean hasUppercase = !s.equals(s.toLowerCase());
                boolean hasLowercase = !s.equals(s.toUpperCase());
                boolean hasDigit = true;
                Pattern.compile( "[0-9]" ).matcher( s ).find();
                if(s.length() <= 6 || s.length() <= 20){
                    if(!hasUppercase){System.out.println("Must have atleast one uppercase Character");}
                    else if(!hasLowercase){System.out.println("Must have atleast one lowercase Character");}
                    else System.out.println("valid");
                }
                else System.out.println("invalid");
    }
}
