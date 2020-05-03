package com.aditech.threading.lockInterface;

import java.util.concurrent.locks.Lock;

public class Counter {

	private Lock lock; // Lock to protect our counter
	private int count; // int to hold our count

	public Counter(Lock myLock) {
		this.lock = myLock;
	}

	public final int getCount() {

		lock.lock();
		try {
			count++;
			return count;
		} finally {
			lock.unlock();
		}
	}

}
