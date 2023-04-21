package org.launchcode.Temperature;

public class TemperatureException extends Exception {
    //all custom exceptions must inherit from the Exception class.

    public TemperatureException(String message){
        super(message);
    }
    //With the relationship between the two classes set up, we now need to add a constructor.
    // In this case, that is all we need to add. We do not want to call the Exception class directly,
    // so we will use TemperatureException to access its properties.
    // The constructor will only have to deal with a message parameter.



}
