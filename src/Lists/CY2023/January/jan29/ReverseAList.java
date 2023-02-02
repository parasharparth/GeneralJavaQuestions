package Lists.CY2023.January.jan29;

import java.util.ArrayList;

public class ReverseAList {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++)
        {
            list.add(i);
        }
        ArrayList<Integer> relist = new ArrayList<>();
        for(int i=list.size()-1; i>=0; i--)
        {
            relist.add(list.get(i));
        }
        for(int i=0; i<relist.size(); i++)
        {
            System.out.println(relist.get(i));
        }
    }
}
