package Lists.CY2023.January.Jan25;

import java.util.ArrayList;

public class InputOutputInList {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++)
            list.add(i);
        System.out.println("The contents of the list are");
        for(int i:list)
            System.out.print(list.get(i));
    }
}
