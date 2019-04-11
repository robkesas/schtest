package degaluapskaita;

public class NumeriaiUtil {
    public static String remobeSpaceNUpperCase(String string) {
        if (string == null){
            return "-";
        }
        string = string.toUpperCase();
        string = string.replaceAll("\\s","");
        return string;
    }

}
