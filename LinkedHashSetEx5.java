import java.util.*;

class LinkedHashSetEx5
{
	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(100);
		set.add(200);
		set.add(100);
		set.add(300);
		set.add(400);
		set.add(500);

		System.out.println(set);// it doesnt allow duplicate elements

	}
}