package Lists.CY2023.February.Feb01;

import java.util.ArrayList;

public class GeneralLists {

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.remove(1);
		list.ensureCapacity(10);
		list.trimToSize();
		list.size();
		if(list.isEmpty())
		{
			list.add(1);
		}
		list.contains(1);

	}
}
