import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by akash on 27/9/18.
 */
public class DecodeString {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String encodedString = bufferedReader.readLine();
        decodeString(encodedString,"");
    }

    private static void decodeString(String encodedString, String decodedString) {
        if(encodedString.length()==0) {
            System.out.println(decodedString);
            return;
        }
        decodeString(encodedString.substring(1),
                decodedString + (getDecodedValue(String.valueOf(encodedString.charAt(0)))));
        if(encodedString.length()>1) {
            char ch = getDecodedValue(encodedString.substring(0,2));
            if(ch>='a' && ch <='z') {
                decodeString(encodedString.substring(2), decodedString + ch);
            }
        }
    }

    private static char getDecodedValue(String str) {
        int i = Integer.parseInt(str);
        return (char) (i+96);
    }
}
