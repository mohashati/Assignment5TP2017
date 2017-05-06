package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.Customer;
import za.ac.cput.oop.domain.Rental;

import java.util.List;

/**
 * Created by tmoshasha on 04/27/2017
 */
public interface CustomerFactory {

    Customer createCustomer(String firstName, String lastName, String phoneNumber, String Address, String City,
                                          String postalCode,
                                          String username, String password, List<Rental> rentals);
}
