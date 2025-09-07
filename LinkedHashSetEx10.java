import java.util.*;

class LinkedHashSetEx10
{
	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);

		System.out.println("set : "+set);

		LinkedHashSet<Integer> setClone=new LinkedHashSet<>();
		setClone=(LinkedHashSet<Integer>)set.clone();

		System.out.println("setClone : "+setClone);

	}
}