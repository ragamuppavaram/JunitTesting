package com.junittesting;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public boolean isFound(String name) {

		boolean isFound = false;
		List<String> nameList = new ArrayList<String>();
		nameList.add("Jack");
		nameList.add("John");
		nameList.add("Jim");
		nameList.add("Mike");

		for (String var : nameList) {
			if (var.equals(name)) { // Tell me why i wouldn't do name.equals(var)
				isFound = true;
				break;
			}
		}

		return isFound;
	}

	public static void main(String args[]) {
		Demo demo = new Demo();
		System.out.print(demo.isFound("aname"));

	}

}
