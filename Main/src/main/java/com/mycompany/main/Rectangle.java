/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author tonqu
 */
public class Rectangle {
    
    private double floorlength;
    private double floorwidth;
    private double ruglength;
    private double rugwidth;

    public Rectangle(double floorlength, double floorwidth, double ruglength, double rugwidth) {
        this.floorlength = floorlength;
        this.floorwidth = floorwidth;
        this.ruglength = ruglength;
        this.rugwidth = rugwidth;
    }


    public Rectangle() {
        this.floorlength = 7;
        this.floorwidth = 6.5;
    }

    public double getFloorlength() {
        return floorlength;
    }

    public void setFloorlength(double floorlength) {
        this.floorlength = floorlength;
    }

    public double getFloorwidth() {
        return floorwidth;
    }

    public void setFloorwidth(double floorwidth) {
        this.floorwidth = floorwidth;
    }

    public double getRuglength() {
        return ruglength;
    }

    public void setRuglength(double ruglength) {
        this.ruglength = ruglength;
    }

    public double getRugwidth() {
        return rugwidth;
    }

    public void setRugwidth(double rugwidth) {
        this.rugwidth = rugwidth;
    }
}
