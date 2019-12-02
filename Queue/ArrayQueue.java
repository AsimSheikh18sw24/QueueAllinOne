/*18SW24*/
public class ArrayQueue implements Queue{
	private Object[] a;
	private int size;
	public ArrayQueue(int capacity){
		a = new Object[capacity];
	} // end of constructor
	// @ over rudden
	public void add(Object obj){
		a[size++] = obj;
	} // end of add method
	// @ over rudden
	public Object first(){
		return a[0];
	} // end of first method
	// @ over rudden
	public int size(){
		return size;
	} // end of size method
	// @ over rudden
	public Object remove(){
		--size;
		Object obj = a[0];
		System.arraycopy(a,1,a,0,size);
		return obj;
	} // end of remove method
	// show method To show queue elements
	public void show(){
		for(int i=0;i<size;i++){
			System.out.println(a[i]);
		} // end of for
	} // end of show method
	// this method will return link queue
	public LinkQueue toLinkQueue(){
		if(size==0)throw new IllegalStateException("Stack is empty");
		LinkQueue lq = new LinkQueue();
		for(int i=0;i<size;i++){
			lq.add(a[i]);
		}
		return lq;
	} // end of linkqueue
}