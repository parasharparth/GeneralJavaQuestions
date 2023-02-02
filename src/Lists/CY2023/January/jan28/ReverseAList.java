package Lists.CY2023.January.jan28;

import java.util.ArrayList;

public class ReverseAList {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++)
        {
            list.add(i);
        }
        for(int i:list)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list.size());
        ArrayList<Integer> reverseList = new ArrayList<>(list.size());
        for(int i=list.size()-1; i>=0; i--)
        {
            reverseList.add(list.get(i));
        }
        for(int i=0; i<10; i++)
        {
            System.out.print(reverseList.get(i));
        }
        System.out.println();

        /****************************************************************************************************************************************************************
         * This means that the for each loop will run in the sequence the elements are added in the array .i.e. i will start from the last element rather than first.
         * This is due to the fact it uses iterator.iterate.
         * Read Java docs at the link @https://docs.oracle.com/javase/8/docs/technotes/guides/language/foreach.html
         * This link has the common problems with the for each loop
         *****************************************************************************************************************************************************************/
        for(int i:reverseList)
        {
            System.out.print(reverseList.get(i)+" ");
        }
    }
}
