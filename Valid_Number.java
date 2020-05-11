public class Valid_Number {
//        Numbers 0-9
//        Exponent - "e"
//        Positive/negative sign - "+"/"-"
//        Decimal point - "."

//        Some examples:
//        " 99e2.5 " => false  |         "0" => true
//        "abc" => false       |     " 0.1 " => true
//        "1 a" => false       |      "2e10" => true
//        " --6 " => false     | " -90e3   " => true
//        " 1e" => false       |   "53.5e93" => true
//        "e3" => false        |     " 6e-1" => true
//        "-+3" => false       |
//        "95a54e53" => false  |

    static boolean isNumber (String s){
        if(s.contains("f") || s.contains("F") || s.contains("d") || s.contains("D"))
            return false;
        try{
            Double.parseDouble(s);
            return true;
        }catch(NumberFormatException ne){return false;}
    }
}
