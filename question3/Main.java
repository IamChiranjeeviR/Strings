package question3;

public class Main {

    public static void main(String[] args) {

        String str = "000214638";

        int end = -1;

        // Find last odd digit
        for (int i = str.length() - 1; i >= 0; i--) {

            if ((str.charAt(i) - '0') % 2 != 0) {
                end = i;
                break;
            }
        }

        // No odd number exists
        if (end == -1) {
            System.out.println("");
            return;
        }

        int start = 0;

        // Remove all leading zeros
        while (start <= end && str.charAt(start) == '0') {
            start++;
        }

        System.out.println(str.substring(start, end + 1));
    }
}