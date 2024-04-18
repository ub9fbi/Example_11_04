/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example_11_04;

/**
 *
 * @author KIP-I-A
 */
public class Time {
    int hour;
    int min;
    int sec;
    int fiveSec;


    public void sumTimeSecond() {
         sec = (hour * 3600) + (min * 60) + fiveSec;
    };

    public void sumFiveSecond() {
        fiveSec =+ 5;
    }
}
