import java.util.List;

public class Helper {
    public static void printList(List<?> lst){
        for(Object item : lst){
            System.out.println(item);
        }
    }
}
