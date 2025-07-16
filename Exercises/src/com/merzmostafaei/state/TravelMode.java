package com.merzmostafaei.state;

public enum TravelMode {
    DRIVING(new DRIVINGState()),
    BICYCLING(new BicyclingState()),
    TRANSIT(new TransitState()),
    WALKING(new WalkingState());

    private final StateService state;

    TravelMode(StateService state){
        this.state=state;
    }
    public StateService getState(){
        return state;
    }
}
