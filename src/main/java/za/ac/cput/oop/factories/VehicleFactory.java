package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.Rental;
import za.ac.cput.oop.domain.Vehicle;

import java.util.List;

/**
 * Created by tmoshasha on 04/27/2017
 */
public interface VehicleFactory {

    Vehicle createVehicle(String SerialNumber, String Make, String Model, String year,
                                              String RefcounterReading, String Gas, String MotorCondition,
                                           String EngineSerialNumber, String EngineSize, String FuelType,
                                           List<Rental> rentals);

}
