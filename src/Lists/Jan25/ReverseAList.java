package Lists.Jan25;

import java.util.List;
import java.util.ArrayList;

public class ReverseAList {

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++)
        {
            list.add(i);
        }
        List<Integer> list1 = new ArrayList<>(list.size());
        for(int i=list.size()-1; i>-1; i--)
        {
            list1.add(list.get(i));
        }
        for(int i:list1)
        {
            System.out.print(list1.get(i) +" ");
        }
//        for(int i:list)
//        {
//            list1.add(list.get(i));
//        }
//        for(int i:list1)
//        {
//            System.out.println(list1.get(i));
//        }
    }
}
