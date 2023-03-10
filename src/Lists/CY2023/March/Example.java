package Lists.CY2023.March;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args)
	{
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
		Arrays.stream(arr).forEach(i-> System.out.println(i));
		ArrayList<Integer> list = new ArrayList<>(arr.length);
		Collections.addAll(list, Arrays.stream(arr).boxed().toArray(Integer[]::new));
		List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		for(int i:list) System.out.println(list.get(i));
		for(int i=0; i< arr.length; i++) System.out.println(list.get(i));
		for(int i:list1) System.out.println(list1.get(i));
		ArrayList<Integer> list2 = new ArrayList<>(arr.length);
		for(int i=0; i<arr.length; i++) list2.add(arr[i]);
		List<int[]> list3 = Arrays.asList(arr);
		System.out.println(list3.get(0).length);
		System.out.println(list1);
		for(int i=0; i<9; i++) System.out.println(list3.get(0)[i]);

		ArrayList<Integer> list4 = new ArrayList<>(5);
		for(int i=0;i<5;i++) list4.add(i);
		for(int i:list) System.out.println(list4.get(i));  //adjointed for loop
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(i -> System.out.println(i)); //For Each loop with its intended purpose

	}
}
