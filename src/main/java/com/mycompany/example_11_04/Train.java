/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example_11_04;

/**
 *
 * @author KIP-I-A
 */
public class Train extends Time {
    public int trainNumber;
    public String directionTrain;
    public int departureHour;
    public int departureMin;
    public String minutesBeforeTrainDeparts;

    public void calculateMinutesToDeparture(){
        minutesBeforeTrainDeparts = String.valueOf((departureHour - hour) * 60 + (departureMin - min)+ " Минут");
    }
}
