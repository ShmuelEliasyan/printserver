
public class PrintJob implements Prioritizeable  {
	protected String text;
	protected int priority;
	//The constructor will accept the text for printing and the priority, and stable them with features
	public PrintJob(String text , int priority) {
		this.text=text;
		if(priority<=MAX_PRIORITY && priority>=MIN_PRIORITY) {
			this.priority=priority;}
		else
			this.priority=MIN_PRIORITY;
	}
	//getters and setters methods
	public String getText() {
		return this.text;
	}
	public void setPriority(int p) {
		if(p>=MIN_PRIORITY&&p<=MAX_PRIORITY)
			this.priority=p;
		else
			this.priority=MIN_PRIORITY;
	}
	public int getPriority() {
		return this.priority;
	}

}
