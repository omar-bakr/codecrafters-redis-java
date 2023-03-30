import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        String input = "PING\r\nPING\r\n";
        String[] words = input.split(System.lineSeparator());

        String stringStart = "+";
        String responseEnd = "\r\n";
        String pingResponse = "PONG";

        StringBuilder response = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            response.append(stringStart + pingResponse + responseEnd);
        }
        System.out.println(response);
    }

}
