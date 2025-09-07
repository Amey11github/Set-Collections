import java.util.*;

class LinkedHashSetEx9
{
	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);

		System.out.println("set : "+set);

		ArrayList<Integer> list=new ArrayList<>(set);

		System.out.println("list : "+list);

		
	}
}