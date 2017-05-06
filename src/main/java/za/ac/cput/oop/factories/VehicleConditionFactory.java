package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.VehicleConditionEmbeddable;

/**
 * Created by tmoshasha on 04/27/2017
 */
public interface VehicleConditionFactory {

    VehicleConditionEmbeddable createAddress(String RefcounterReading, String Gas, String MotorCondition);

}
