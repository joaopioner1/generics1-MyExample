package entities;

import java.util.ArrayList;
import java.util.List;

public class ManipulateData<T> {
	
	private List<T> list = new ArrayList<>();
	
	public T getFirst() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void addValue(T value) {
		list.add(value);
	}
}
