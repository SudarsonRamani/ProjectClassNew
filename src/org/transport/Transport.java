package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	
	public void transportForm() {
		System.out.println("Transport form are");
		System.out.println("Sample Transport form are");
	}

	
	public static void main(String[] args) {
		
		Transport a=new Transport();
		a.transportForm();
		
		Road b=new Road();
		b.bike();
		b.cycle();
		b.bus();
		b.car();
		
		Air c=new Air();
		c.aeroPlane();
		c.heliCopter();
		
		Water d=new Water();
		d.boat();
		d.ship();
		
		
	}
}
