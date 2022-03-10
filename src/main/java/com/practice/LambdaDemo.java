package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(8);
		
		//too old concept
		Iterator it = l1.iterator();
		while(it.hasNext()) {
			int s1 = (int)it.next();
			System.out.println(s1);
		}

		l1.forEach(s3->System.out.println(s3));
	}

}
