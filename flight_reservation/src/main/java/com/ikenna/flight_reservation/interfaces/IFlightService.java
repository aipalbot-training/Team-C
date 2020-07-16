package com.ikenna.flight_reservation.interfaces;

import com.ikenna.flight_reservation.models.Card;
import com.ikenna.flight_reservation.models.Person;
import com.ikenna.flight_reservation.models.Receipt;

public interface IFlightService {
	public Receipt bookFlight(Receipt p);
	String reserveFlight(Person p, Card c);
}
