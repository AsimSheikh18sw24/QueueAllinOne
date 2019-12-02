public class LinkQueueTest{
		public static void main(String[] args) {
		LinkQueue buy = new LinkQueue();
		LinkQueue sell = new LinkQueue();
		// adding buying prices
		buy.add(400.1);
		buy.add(500.90);
		buy.add(470.5);
		buy.add(409.7);
		// adding selling prices
		sell.add(500.50);
		sell.add(550.70);
		sell.add(530.90);
		sell.add(520.20);

		double purchase=0,sellings=0;

		//System.out.println("Showing purchase");
		//buy.show();
		//System.out.println("Showing sell");
		//sell.show();
		//System.out.println("Size of queue "+buy.size());
		//System.out.println(buy.toString());
		//System.out.println("Second element of buy "+buy.second());
		for(int i=0;i<4;i++){
			purchase=purchase+(double)buy.remove();
			sellings=sellings+(double)sell.remove();
		} // end 0f for
		System.out.println("Sellings = " + sellings + " purchase = " + purchase);
		System.out.println("Profit = " + (sellings-purchase));
	} // end of main method

}