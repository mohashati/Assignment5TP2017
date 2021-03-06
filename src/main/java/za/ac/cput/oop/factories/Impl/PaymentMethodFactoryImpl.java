package za.ac.cput.oop.factories.Impl;

import za.ac.cput.oop.domain.PaymentMethod;
import za.ac.cput.oop.factories.PaymentMethodFactory;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class PaymentMethodFactoryImpl implements PaymentMethodFactory {

    private static PaymentMethodFactoryImpl factory = null;

    private  PaymentMethodFactoryImpl() {
    }
    public static PaymentMethodFactoryImpl getInstance(){
        if(factory ==null)
            factory = new PaymentMethodFactoryImpl();
        return factory;
    }

    public  PaymentMethod createPaymentMethod(String PaymentType, double Price)
    {
        PaymentMethod paymentMethod = new PaymentMethod
                .Builder(PaymentType)
                .Price(Price)
                .build();
        return paymentMethod;
    }
}
