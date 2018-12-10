//shmuel eliasyan 208623678
import java.util.ArrayList;
public class PriorityQueue<E extends Prioritizeable> {
	private ArrayList<E> arraylist;
	//An empty constructor will reboot the queue into an empty queue
	public PriorityQueue() {
		arraylist=new ArrayList<E>();
	}
	//The method will receive an E object and insert it to its correct position in the queue
	public void insert(E element) {
		if(arraylist.isEmpty()==true) {
			arraylist.add(0, element);
		}
		else if(element.getPriority()<=arraylist.get(arraylist.size()-1).getPriority()) {
			arraylist.add(arraylist.size(), element);
		}
		else {
			for(int i=0;i<arraylist.size();i++) {
				if(element.getPriority()>arraylist.get(i).getPriority()) {
					arraylist.add(i, element);
					return;
				}
			} 
		}
	}
	//The method will remove the first organ from the queue
	public E remove() {
		if(arraylist.isEmpty()==true) 
			return null;
		return arraylist.remove(0);//check this..
	}
	//The method returns the line elements in a string format
	public String toString() {
		String str="";
		if(arraylist.isEmpty())
			return str;
		else
			for(int i=0;i<arraylist.size();i++)
				str += arraylist.get(i);
		return str; 
	}
}