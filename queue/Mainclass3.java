package com.queue;

import java.util.PriorityQueue;

public class Mainclass3 {
	public static void main(String[] args) {
		PriorityQueue q1=new PriorityQueue();
		System.out.println("Priority queue element");
		System.out.println(q1);
		System.out.println("total element in queue: "+q1.size());
		System.out.println("is queue empty ?"+q1.isEmpty());
		
		q1.add(100);
		q1.add(54);
		q1.add(150);
		q1.add(10);
		q1.add(35);
		q1.add(5);
		
		Object element = q1.poll();
		while(element != null) {
			System.out.println(element);
			element=q1.poll();
		}
		System.out.println("Priority queue element");
		System.out.println(q1);
		System.out.println("total element in queue: "+q1.size());
		System.out.println("is queue empty ?"+q1.isEmpty());
	}
}
