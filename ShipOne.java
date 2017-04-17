package com.gmail.s12348.evgen;

public class ShipOne implements Runnable {
	private int cargo = 10;

	public ShipOne() {
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
		System.out.println("ShipOne finished");
	}

}
