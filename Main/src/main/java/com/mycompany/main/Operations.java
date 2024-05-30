/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author tonqu
 */
public class Operations {
    Rectangle rectangle = new Rectangle();
    
      public void setNewFloorDimensions(double floorWidth, double floorLength) {
        rectangle.setFloorwidth(floorWidth);
        rectangle.setFloorlength(floorLength);
    }

    public void setRugDimensions(double rugWidth, double rugLength) {
        rectangle.setRugwidth(rugWidth);
        rectangle.setRuglength(rugLength);
    }
    
    public void calculateArea(int op) {
        double totalArea;
        if (op == 1) {
            totalArea = rectangle.getFloorlength() * rectangle.getFloorwidth();
            System.out.println("Area " + totalArea);
        } else {
            totalArea = rectangle.getRuglength() * rectangle.getRugwidth();
            System.out.println("Area " + totalArea);
        }
    }

    public void calculatePerimeter(int op) {
        double perimeter;
        if (op == 1) {
            perimeter = 2 * (rectangle.getFloorlength() + rectangle.getFloorwidth());
            System.out.println("Perimeter " + perimeter);
        } else {
            perimeter = 2 * (rectangle.getRuglength() + rectangle.getRugwidth());
            System.out.println("Perimeter " + perimeter);
        }
    }

    public void compareSizes(int op) {
        double area, areaFloor, areaRug, perimeter, perimeterFloor, perimeterRug;
        if (op == 1) {
            areaFloor = rectangle.getFloorlength() * rectangle.getFloorwidth();
            areaRug = rectangle.getRuglength() * rectangle.getRugwidth();
            area = areaFloor - areaRug;
            if (areaFloor > areaRug) {
                System.out.println("Covered area: " + areaRug
                        + "\nLeftover space: " + area);
            } else {
                System.out.println("The rug is bigger than the floor");
            }
        } else{
            perimeterFloor = 2 * (rectangle.getFloorlength() + rectangle.getFloorwidth());
            perimeterRug = 2 * (rectangle.getRuglength() + rectangle.getRugwidth());
            perimeter = perimeterFloor - perimeterRug;
            if (perimeterFloor > perimeterRug) {
                System.out.println("Covered perimeter: " + perimeterRug
                        + "\nLeftover perimeter: " + perimeter);
            } else {
                System.out.println("The perimeter of the carpet is larger");
            }
        }
    }
}
