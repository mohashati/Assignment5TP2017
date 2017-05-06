package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.PaymentMethod;
import za.ac.cput.oop.domain.Rental;

import java.util.List;

/**
 * Created by tmoshasha on 04/27/2017
 */
public interface RentalFactory {

    Rental createRental(String pickUpdate, String returnDate, List<PaymentMethod> paymentMethod);

}
