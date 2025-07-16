package com.merzmostafaei.state;

public class DirectionService {
    private TravelMode travelMode;

    public void getTravelInfo(){
        StateService state = travelMode.getState();
        state.getDirection();
        state.getETA();
    }

    public void setTravelMode(TravelMode travelMode){
        this.travelMode = travelMode;
    }

    

    @Override
    public String toString() {
        return "DirectionService{" +
                "travelMode=" + travelMode +
                '}';
    }

}
