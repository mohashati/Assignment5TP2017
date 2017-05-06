package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.AddressEmbeddable;

/**
 * Created by tmoshasha on 04/27/2017
 */
public interface AddressEmbeddableFactory {

    AddressEmbeddable createAddress(String Address, String City, String postalCode);
}
