package Lists.CY2023.January.jan28;
import java.util.ArrayList;

/************************************************************************************************************************
 * Default Quantity of ArrayList is 10.
 * ensureCapacity for increasing capacity to ensure a certain number of elements can be held there.
 * This is true for streaming environments where there are a lot of elements present.
 * list.size() gives the CURRENT SIZE and not the default allocated size for the arraylist or for that matter any list
 ************************************************************************************************************************/
public class QuantityIncrease {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(20);
        System.out.println(list.size());
    }
}
