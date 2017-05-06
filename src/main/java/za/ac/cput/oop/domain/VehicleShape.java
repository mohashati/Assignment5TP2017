package za.ac.cput.oop.domain;

/**
 * Created by tmoshasha on 04/27/2017
 */
public abstract class VehicleShape {

    VehicleShape nextVehicleShape;

    public void setnextVehicleShape(VehicleShape nextVehicleShape) {
        this.nextVehicleShape = nextVehicleShape;
    }
    public abstract String handleRequest(int request);

    public abstract void nextVehicleShape(VehicleShapeHatchBack hatch);
}
