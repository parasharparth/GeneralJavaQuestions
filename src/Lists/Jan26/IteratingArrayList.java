package Lists.Jan26;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<list.size(); i++)
        {
            list.add(i);
        }
        ArrayList<Integer> copy_list = new ArrayList<>(list.size());
        for(int i:list)
        {
            copy_list.add(list.get(i));
        }
        ArrayList<Integer> rev_list = new ArrayList<>(copy_list.size());

    }
}
