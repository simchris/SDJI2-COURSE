package library.domain.model;

import utility.collection.ArraySet;
import utility.collection.SetADT;

public class BorrowerList {

	private SetADT<User> list;

	public BorrowerList() {
		this.list = new ArraySet<>();
	}

	public void add(String name, String email, String CPR) {
		list.add(new User(name, email, CPR));
	}

	public int size() {
		return list.size();
	}

	public String toString() {

		return list.toString();
	}

	public User getUser(String CPR) {
		for (int i = 0; i < list.size(); i++) {
			if (list.iterator().next().getCPR().equals(CPR))
				return list.iterator().next();

		}
		return null;

	}

}
