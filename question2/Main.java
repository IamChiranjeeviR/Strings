package question2;

public class Main {
    public static void main(String[] args) {

        String str = " amazing coding   skills ";
        
        System.out.println(reverseWordsInString(str));
        System.out.println(reverseWordsInStringOptimized(str));
    }
    
    public static String reverseWordsInString(String str) {

        str = str.trim();

        String[] arr = str.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = arr.length - 1; i > -1; i--) {
            result.append(arr[i]);

            if (i != 0)
                result.append(" ");
        }

        return result.toString();
    }

    public static String reverseWordsInStringOptimized(String str) {
        StringBuilder result = new StringBuilder();

        int i = str.length() - 1;

        while (i >= 0) {

            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }

            int j = i;

            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }

            if (j >= 0) {
                result.append(str.substring(i + 1, j + 1));
                result.append(" ");
            }

        }

        return result.toString();
    }
}
