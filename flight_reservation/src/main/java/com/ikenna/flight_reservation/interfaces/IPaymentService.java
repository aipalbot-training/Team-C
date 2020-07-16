package com.ikenna.flight_reservation.interfaces;

import com.ikenna.flight_reservation.models.Card;
import com.ikenna.flight_reservation.utils.CardTypes;

public interface IPaymentService {
	 public Card createPaymentMethod(CardTypes type);
}
