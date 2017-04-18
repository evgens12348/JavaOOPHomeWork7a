package com.gmail.s12348.evgen;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Dok {

	public Dok() {

	}

	public void turnOfShips() {

		ExecutorService exs = Executors.newFixedThreadPool(2);
		int a = (int) (Math.random() * 100);
		if (a >= 0 & a <= 17) {
			exs.submit(new ShipTree());
			exs.submit(new ShipTwo());
			exs.submit(new ShipOne());
		} else if (a > 17 & a <= 34) {
			exs.submit(new ShipTwo());
			exs.submit(new ShipTree());
			exs.submit(new ShipOne());
		} else if (a > 34 & a <= 51) {
			exs.submit(new ShipTree());
			exs.submit(new ShipOne());
			exs.submit(new ShipTwo());
		} else if (a > 51 & a <= 68) {
			exs.submit(new ShipOne());
			exs.submit(new ShipTree());
			exs.submit(new ShipTwo());
		} else if (a > 68 & a <= 85) {
			exs.submit(new ShipTwo());
			exs.submit(new ShipOne());
			exs.submit(new ShipTree());
		} else if (a > 85) {
			exs.submit(new ShipOne());
			exs.submit(new ShipTwo());
			exs.submit(new ShipTree());
		}
		exs.shutdown();

	}

}
