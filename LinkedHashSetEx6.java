import java.util.*;

class LinkedHashSetEx6
{
	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);

		System.out.println(set);

		System.out.println(set.contains(30));

		System.out.println(set.contains(300));


		
	}
}