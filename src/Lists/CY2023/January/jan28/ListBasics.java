package Lists.CY2023.January.jan28;
import java.util.ArrayList;

public class ListBasics {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++)
        {
            list.add(i);
        }
        ArrayList<Integer> list1 = new ArrayList<>(list.size());
        for(int i:list)
        {
            list1.add(list.get(i));
        }
        for(int i:list1)
        {
            System.out.print(list1.get(i)+" ");
        }
    }
}
