package com.first.day;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amrmalaj
 *
 */
public class GenericSuperTest {
	public static void main(String[] args) {
		IEmployee iOne = new ServiceOneImpl();
		IEmployee iTwo = new ServiceSecondImpl();
		List<? super IEmployee> list = new ArrayList<IEmployee>();
		list.add(iOne);
		list.add(iTwo);
		list.add(iOne);
		list.add(iTwo);
		list.stream().forEach(it->{
			System.out.println(it.toString());
		});
	}
}

class ServiceOneImpl implements IEmployee {

	@Override
	public String show() {
		return "ServiceOne";
	}

	@Override
	public String toString() {
		return show();
	}
}

class ServiceSecondImpl implements IEmployee {

	@Override
	public String show() {
		return "ServiceTwo";
	}

	@Override
	public String toString() {
		return show();
	}

}

interface IEmployee {
	String show();
}
