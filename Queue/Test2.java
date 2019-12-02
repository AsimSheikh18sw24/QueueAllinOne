public class Test{
	public static void main(String[] args) {
		ArrayQueue buy = new ArrayQueue(4);
		ArrayQueue sell = new ArrayQueue(4);
		buy.add(400.1);
		buy.add(500.90);
		buy.add(470.5);
		buy.add(409.7);

		sell.add(500.50);
		sell.add(550.70);
		sell.add(530.90);
		sell.add(520.20);
		double purchase=0,sellings=0;
		for(int i=0;i<4;i++){
			purchase=purchase+(double)buy.remove();
			sellings=sellings+(double)sell.remove();
		} // end 0f for
		System.out.println("Sellings = " + sellings + " purchase = " + purchase);
		System.out.println("Profit = " + (double)(sellings-purchase));
	}
}