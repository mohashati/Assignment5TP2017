package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.EngineSizeEmbeddable;

/**
 * Created by tmoshasha on 04/27/2017
 */
public interface EngineSizeFactory {

    EngineSizeEmbeddable createEngineSizeEmbeddable(String EngineSerialNumber, String EngineSize, String FuelType);
}
