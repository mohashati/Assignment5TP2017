package za.ac.cput.oop.domain;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class VehicleShapeSedan extends VehicleShape {

    @Override
    public String handleRequest(int request) {
        if(request > 60 & request < 70){ //the 60 and 70 is used as code for each shape of the car
            return "Sedan";
        }else{
            if (nextVehicleShape!=null) {
                return nextVehicleShape.handleRequest(request);
            }
            return "Not in Stock";
        }
    }

    @Override
    public void nextVehicleShape(VehicleShapeHatchBack hatch) {

    }
}
