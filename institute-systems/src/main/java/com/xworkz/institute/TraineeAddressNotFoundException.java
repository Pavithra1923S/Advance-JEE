package com.xworkz.institute;

public class TraineeAddressNotFoundException extends RuntimeException{
    public TraineeAddressNotFoundException(String errorMsg) {
        super(errorMsg);
    }
}
