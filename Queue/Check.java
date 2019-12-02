public class Check{
	public static void main(String[] args) {
		ArrayQueue aq = new ArrayQueue(5);
		aq.add("Lamborgini");
		aq.add("Bugatti");
		aq.add("Ferrari");
		aq.add("Rolls Royce");
		aq.add("Range Rover");
		aq.show();
		System.out.println();
		LinkQueue lq = new LinkQueue();
		lq = aq.toLinkQueue();
		lq.show();
		System.out.println();
		ArrayQueue aq1 = new ArrayQueue(lq.size());
		aq1 = lq.toArrayQueue();
		aq1.show();
	}
}