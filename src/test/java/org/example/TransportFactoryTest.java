package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransportFactoryTest {
	private Transport transport;
	City gonduras = new City("Gonduras", 2000,true,false);
	City sosedsk = new City("Sosedsk", 15);
	City stoliciya = new City("BigSity", 7128, true,true);
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
	//Capacity
	@Test
	public void capacityRound1() { //верхняя грвница
		transport = TransportFactory.getTransport(kulichki, 1999, 1500);
		assertEquals(2000, transport.getCapacity());
	}
	@Test
	public void capacityRound2() { //нижняя граница
		transport = TransportFactory.getTransport(kulichki, 1, 1500);
		assertEquals(500, transport.getCapacity());
	}

	@Test
	public void speedRound1() { //верхняя  граница
		transport = TransportFactory.getTransport(stoliciya, 1, 1);
		assertEquals(7130, transport.getSpeed());
	}
	@Test
	public void speedRound2() { //нижняя граница
		transport = TransportFactory.getTransport(stoliciya, 1, 7000);
		assertEquals(10, transport.getSpeed());
	}

	//null
	@Test
	public void notAssert() {
		transport = TransportFactory.getTransport(stoliciya, 1, 0);
		
	}
}