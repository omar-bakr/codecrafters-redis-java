public class Test {
    public static void main(String[] args) {
        String input = "PING\r\nPING\r\n";
        String[] words = input.split(System.lineSeparator());

        String stringStart = "+";
        String responseEnd = "\r\n";
        String pingResponse = "PONG";

        //Responding to client input
        for (int i = 0; i < words.length; i++) {
            System.out.print(stringStart + "PONG" + responseEnd);
        }
    }

}
