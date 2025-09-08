class TreeSet
{
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		System.out.println(set.isEmpty());
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		System.out.println(set);

		System.out.println("size() : "+set.size());

		System.out.println(" isEmpty() : "+set.isEmpty());

		System.out.println(" remove(20) : "+set.remove(20));

		Collection<Integer> coll1=new ArrayList<>();
		coll1.add(60);
		coll1.add(70);
		coll1.add(80);
		coll1.add(90);

		System.out.println("coll1 : "+coll1);


		System.out.println(" addAll(coll1) : "set.addAll(coll1));

		System.out.println();

	}
}