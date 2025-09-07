import java.util.*;

class LinkedHashSetEx3
{
	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(600);

		System.out.println(set);

		set.addFirst(800);
		System.out.println(set);

		set.addLast(900);
		System.out.println(set);

		System.out.println(set.getFirst());

		System.out.println(set.getLast());

		System.out.println(set.removeFirst());
		System.out.println(set);

		System.out.println(set.removeLast());
		System.out.println(set);

		System.out.println(set.reversed());

	}
}