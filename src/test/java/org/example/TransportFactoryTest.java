package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransportFactoryTest {
	private Transport transport;
	City gonduras = new City("Gonduras", 2000,true,false);
	City sosedsk = new City("Sosedsk", 15);
	City stoliciya = new City("BigSity", 9100, true,true);
	City kulichki = new City("kulichki", 2631, false,false);

	@Test
	public void Truck() {
	transport = TransportFactory.getTransport(gonduras,327, 1000);
	assertTrue(transport instanceof Truck);
	}
	@Test
	public void Ship() {
		transport = TransportFactory.getTransport(sosedsk,15, 1000);
		assertTrue(transport instanceof Ship);
	}
	@Test
	public void firstTruck() { //есть вода и аэропорт
		transport = TransportFactory.getTransport(stoliciya, 164, 84);
		assertTrue(transport instanceof Truck);
	}
	@Test
	public void secondTruck() { //есть вода и аэропорт
		transport = TransportFactory.getTransport(stoliciya, 444, 220);
		assertTrue(transport instanceof Truck);
	}

	@Test
	public void threeTruck1() { //нет воды
		transport = TransportFactory.getTransport(gonduras, 444, 3000);
		assertTrue(transport instanceof Truck);
	}

	@Test
	public void forTruck() { //нет аэропорта
		transport = TransportFactory.getTransport(gonduras, 1987, 33);
		assertTrue(transport instanceof Truck);
	}

	@Test
	public void kulichkiTruck1() { //ниче нет
		transport = TransportFactory.getTransport(kulichki, 1987, 15);
		assertTrue(transport instanceof Truck);
	}
	@Test
	public void kulichkiTruck2() { //ниче нет
		transport = TransportFactory.getTransport(kulichki, 1987, 1500);
		assertTrue(transport instanceof Truck);
	}
}