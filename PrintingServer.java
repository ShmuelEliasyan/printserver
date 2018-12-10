

public class PrintingServer {

	private PriorityQueue<PrintJob> printList;
    //An empty constructor will open an empty queue
	public PrintingServer() {
		printList=new PriorityQueue<PrintJob>();
	}
	//The method will get a print job and add it to the queue
	public void acceptJob(PrintJob p) {
		printList.insert(p);
	}
    //The method will print the first job in line and remove it from the queue
	public void print() {
		PrintJob first=printList.remove();
		if(first==null)
			return;
		System.out.println(first.getText());
	}
}	
