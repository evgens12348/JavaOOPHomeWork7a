package com.gmail.s12348.evgen;

public class ShipTree implements Runnable {
	private int cargo = 10;

	public ShipTree() {
		super();
	}

	@Override
	public void run() {
		for (int i = cargo; i > 0; i -= 1) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ShipTree finished");
	}

}
