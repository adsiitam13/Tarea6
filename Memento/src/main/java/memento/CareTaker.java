package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker{
	private List<Memento> mementoList=new ArrayList<Memento>();
	private int ops;
	
	public CareTaker(){
		ops=0;
	}	

	public void add(Memento m){
		mementoList.add(m);
		ops++;
		System.out.println("Se guardó el resultado #"+ops+": "+m.getRes());	
	}

	public Memento get(int index){
		return mementoList.get(index);
	}
}
