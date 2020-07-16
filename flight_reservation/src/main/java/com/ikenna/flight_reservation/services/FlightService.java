package com.ikenna.flight_reservation.services;

import com.ikenna.flight_reservation.interfaces.IFlightService;
import com.ikenna.flight_reservation.interfaces.IReservationService;
import com.ikenna.flight_reservation.models.Card;
import com.ikenna.flight_reservation.models.Person;
import com.ikenna.flight_reservation.models.Receipt;

public class FlightService implements IFlightService {
	
	public IReservationService rsv;
	
	public FlightService(IReservationService rsv) {
		this.rsv = rsv;
	}
	
	@Override
	public Receipt bookFlight(Receipt p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reserveFlight(Person p, Card c) {
		this.rsv.prepareReservation(p, c);
		return null;
	}


}
