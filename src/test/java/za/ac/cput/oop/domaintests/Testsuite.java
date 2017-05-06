package za.ac.cput.oop.domaintests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by tmoshasha on 04/27/2017
 */@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddressEmbeddableTest.class,
        CustomerTest.class,
        EngineSizeTest.class,
        LoginTest.class,
        PaymentTest.class,
        RentalTest.class,
        SalesPersonTest.class,
        VehicleShapeTestChainOfRe.class,
        VehicleTest.class
})
public class Testsuite {
}
