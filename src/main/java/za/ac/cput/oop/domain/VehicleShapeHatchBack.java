package za.ac.cput.oop.domain;

/**
 * Created by tmoshasha on 04/27/2017.
 */
public class VehicleShapeHatchBack extends VehicleShape {

    @Override
    public String handleRequest(int request) {

        if(request > 70 & request < 75){ //the 70 and 75 is used as code for each shape of the car
            return "HatchBack";
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
