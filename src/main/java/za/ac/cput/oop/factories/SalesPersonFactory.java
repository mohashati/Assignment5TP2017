package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.Customer;
import za.ac.cput.oop.domain.SalesPerson;

import java.util.List;

/**
 * Created by tmoshasha on 04/27/2017
 */
public interface SalesPersonFactory {

    SalesPerson createSalesPerson(String firstName, String lastName, int hours,
                                  double rate, String username, String password, List<Customer> customers);

}
