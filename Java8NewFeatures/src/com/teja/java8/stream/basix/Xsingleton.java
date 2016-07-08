package com.teja.java8.stream.basix;

public class Xsingleton {
	private static volatile long x = 0;
	private static volatile Xsingleton instance = null;

	private Xsingleton() {
	}

	public long getX() { 
		return x;
	}

	public void setX(long l) {
		synchronized (Xsingleton.class) {
			this.x = l;
		}
	}

	public static Xsingleton getXsingleton() {

		if (instance == null) {

			synchronized (Xsingleton.class) {
				if (instance == null) {
					instance = new Xsingleton();
				}

			}

		}
		return instance;

	}

}
