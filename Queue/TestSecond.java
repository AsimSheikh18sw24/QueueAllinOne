class TestSecond{
	public static void main(String[] args) {
		LinkQueue q = new LinkQueue();
		q.add(8);
		q.add(101);
		q.add(10);
		q.add(11);
		q.add(12);
		q.add(13);
		System.out.println("First= " + q.first());
		System.out.println("Second= " + q.second());
		System.out.println("Second last= " + q.secondLast());
		Object a[]=q.toArray();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("First= " + q.first());
		System.out.println("Second= " + q.second());
		System.out.println("Second last= " + q.secondLast());
		q.show();
		System.out.println("First= " + q.first());
		System.out.println("Second= " + q.second());
		System.out.println("Second last= " + q.secondLast());
		q.show();
		System.out.println("First= " + q.first());
		System.out.println("Second= " + q.second());
		System.out.println("Second last= " + q.secondLast());
	}
}