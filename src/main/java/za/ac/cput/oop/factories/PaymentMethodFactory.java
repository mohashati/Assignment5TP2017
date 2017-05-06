package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.PaymentMethod;

/**
 * Created by tmoshasha on 04/27/2017
 */
public interface PaymentMethodFactory {

    PaymentMethod createPaymentMethod(String PaymentType, double Price);
}
