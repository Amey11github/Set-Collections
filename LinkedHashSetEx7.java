import java.util.*;

class LinkedHashSetEx7
{
	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		System.out.println(set);

		System.out.println(set.remove(30));

		System.out.println(set);

	}
}