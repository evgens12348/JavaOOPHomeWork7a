package com.gmail.s12348.evgen;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Dok {
	private RandomStart rs;

	public Dok() {

	}

	public RandomStart randomStart() {
		int a;
		int b;
		int c;
		do {
			a = (int) (Math.random() * 100);
			b = (int) (Math.random() * 100);
			c = (int) (Math.random() * 100);
		} while (a == b & b == c & c == a);
		this.rs = new RandomStart(a, b, c);
		return rs;

	}

	public void turnOfShips() {

		ExecutorService exs = Executors.newFixedThreadPool(2);
		randomStart();
		if (rs.getA() < rs.getB() & rs.getB() < rs.getC()) {
			exs.submit(new ShipTree());
			exs.submit(new ShipTwo());
			exs.submit(new ShipOne());
		} else if (rs.getA() < rs.getC() & rs.getC() < rs.getB()) {
			exs.submit(new ShipTwo());
			exs.submit(new ShipTree());
			exs.submit(new ShipOne());
		} else if (rs.getB() < rs.getA() & rs.getA() < rs.getC()) {
			exs.submit(new ShipTree());
			exs.submit(new ShipOne());
			exs.submit(new ShipTwo());
		} else if (rs.getB() < rs.getC() & rs.getC() < rs.getA()) {
			exs.submit(new ShipOne());
			exs.submit(new ShipTree());
			exs.submit(new ShipTwo());
		} else if (rs.getC() < rs.getA() & rs.getA() < rs.getB()) {
			exs.submit(new ShipTwo());
			exs.submit(new ShipOne());
			exs.submit(new ShipTree());
		} else if (rs.getC() < rs.getB() & rs.getB() < rs.getA()) {
			exs.submit(new ShipOne());
			exs.submit(new ShipTwo());
			exs.submit(new ShipTree());
		}
		exs.shutdown();

	}

	private class RandomStart {
		private int a;
		private int b;
		private int c;

		public RandomStart(int a, int b, int c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
		}

		public int getA() {
			return a;
		}

		public int getB() {
			return b;
		}

		public int getC() {
			return c;
		}

	}

}
