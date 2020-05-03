package com.aditech.threading.lockInterface;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {

		// Create a counter and shared it between three threads
		// Since counter needs a lock its getCount() method
		// we are giving it a ReentrantLock.
		final Counter counter = new Counter(new ReentrantLock());
		// Task to be executed by threads
		Runnable r = new Runnable() {

			@Override
			public void run() {

				System.out.printf("Count at thread %s is %d %n",
						Thread.currentThread().getName(), counter.getCount());
			}

		};
		// creating three threads
		Thread t1 = new Thread(r, "T1");
		Thread t2 = new Thread(r, "T2");
		Thread t3 = new Thread(r, "T3");

		t1.start();
		t2.start();
		t3.start();
	}
}
