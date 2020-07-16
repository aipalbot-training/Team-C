package com.ikenna.flight_reservation.interfaces;

import com.ikenna.flight_reservation.models.Card;
import com.ikenna.flight_reservation.models.Person;
import com.ikenna.flight_reservation.models.Receipt;

public interface IReservationService {
	public String reserveSeat(Person person);
	public Receipt prepareReservation(Person person, Card card);
}
