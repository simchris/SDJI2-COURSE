package utility.collection;

import java.util.Iterator;

public class ArraySet<T> implements SetADT<T> {

	private static int DEFAULT_CAPACITY = 100;
	private int size;
	private T[] set;

	@SuppressWarnings("unchecked")
	public ArraySet() {
		this.size = 0;
		this.set = (T[]) new Object[DEFAULT_CAPACITY];
	}

	@SuppressWarnings("unchecked")
	public ArraySet(int initialCapacity) {
		this.size = 0;
		this.set = (T[]) new Object[initialCapacity];
	}

	public String toString() {
		String all = "{";
		for (int i = 0; i < size(); i++) {
			all += set[i];
			if (i < size - 1) {
				all += ", ";
			}
		}
		all += "}";
		return all;
	}

	@Override
	public Iterator<T> iterator() {

		return new ArraySetIterator();
	}

	@Override
	public void add(T element) {
		if (element.equals(null))
			throw new IllegalArgumentException("Null elements not allowed");
		if (!contains(element)) {
			set[size] = element;
			size++;
		}

	}

	@Override
	public T remove(T element) {
		if (element.equals(null))
			throw new IllegalArgumentException("Nul elements are not allowed");

		T other = (T) new Object();
		for (int i = 0; i < this.size(); i++)
		{
			if (set[i].equals(element))
			{
				other=set[i];
				for (int j = i; j < size(); j++) 
				{
					set[j] = set[j + 1];
				}
				size--;
				break;
			}

		}
		return other;
	}

	@Override
	public boolean contains(T element) {
		for (int i = 0; i < size(); i++) {
			if (set[i].equals(element))
				return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isSubset(SetADT<T> newSet) {
		for (int i = 0; i < size(); i++) {
			if (newSet.contains(set[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public SetADT<T> intersection(SetADT<T> newSet) {
		SetADT<T> intersection = new ArraySet<T>();
		for (int i = 0; i < size(); i++) {
			if (newSet.contains(set[i])) {
				intersection.add(set[i]);
			}
		}
		return intersection;
	}

	@Override
	public SetADT<T> union(SetADT<T> newSet) {

		SetADT<T> union = new ArraySet<T>();

		for (int i = 0; i < size(); i++) {
			union.add(set[i]);
		}
		Iterator<T> currentIterator =newSet.iterator();
		
		while ( !currentIterator.next().equals(null))
		{
				if (!union.contains(currentIterator.next()) && currentIterator.hasNext())
				{
					union.add(currentIterator.next());
					System.out.println(union);
				}			
		}
		
		return union;
	}

	public class ArraySetIterator implements Iterator<T> {

		private int currentIndex;
		private boolean canBeRemoved;

		public ArraySetIterator() {
			this.currentIndex = 0;
			this.canBeRemoved = false;
		}

		@Override
		public boolean hasNext() {

			if(next().equals(null))
				return false;
			else	
			return true;
		}

		@Override
		public T next() {
			if(currentIndex==0)
			{
				currentIndex++;
				return set[0];
			}
			else
			{
				canBeRemoved = true;
				currentIndex++;
				return set[currentIndex];
			}
		}

		public void remove() {

		}
	}
}
