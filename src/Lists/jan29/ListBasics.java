package Lists.jan29;

import java.util.ArrayList;

public class ListBasics {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(20);
        for(int i=0; i<10; i++)
        {
            list.add(i);
        }
        for(int i=0; i<10; i++)
        {
            list.get(i);
        }
        list.trimToSize();
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.println(list.size());
    }
}
