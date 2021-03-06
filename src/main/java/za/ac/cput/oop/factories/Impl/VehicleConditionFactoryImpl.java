package za.ac.cput.oop.factories.Impl;

import za.ac.cput.oop.domain.VehicleConditionEmbeddable;
import za.ac.cput.oop.factories.VehicleConditionFactory;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class VehicleConditionFactoryImpl implements VehicleConditionFactory {

    private static VehicleConditionFactoryImpl factory = null;

    private  VehicleConditionFactoryImpl() {
    }
    public static VehicleConditionFactoryImpl getInstance(){
        if(factory ==null)
            factory = new VehicleConditionFactoryImpl();
        return factory;
    }

    public VehicleConditionEmbeddable createAddress(String RefcounterReading, String Gas, String MotorCondition)
    {
        VehicleConditionEmbeddable addressEmbeddable = new VehicleConditionEmbeddable
                .Builder(RefcounterReading)
                .Gas(Gas)
                .MotorCondition(MotorCondition)
                .build();

        return addressEmbeddable;
    }
}
