public class Valid_Number {
    static boolean isNumber (String s){
        if(s.contains("f") || s.contains("F") || s.contains("d") || s.contains("D"))
            return false;
        try{
            Double.parseDouble(s);
            return true;
        }catch(NumberFormatException ne){return false;}
    }
}
