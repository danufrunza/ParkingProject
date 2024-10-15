package com.dprojects;

import com.dprojects.dto.CarDTO;
import com.dprojects.enums.CarType;

import java.util.ArrayList;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        ArrayList<CarDTO> cars =  getTotalNumberOfCarsInTheParking();
        System.out.println("The total number of cars in the parking : " + cars.size());

        for (CarDTO car : cars) {
            System.out.println(car.getId() +" Marca: "+ car.marca +" -- Model: "+ car.model + " -- CarType: "+car.type.toString());
        }
    }

    public static ArrayList<CarDTO> getTotalNumberOfCarsInTheParking() {
        ArrayList<CarDTO> carList = new ArrayList<>();
        carList.add(new CarDTO(1, "VK","Golf1", CarType.HATCHBACK));
        carList.add(new CarDTO(2, "VK","Golf2", CarType.HATCHBACK));
        carList.add(new CarDTO(5, "VK","Golf3", CarType.HATCHBACK));
        carList.add(new CarDTO(3, "Honda","Accord", CarType.SEDAN));
        carList.add(new CarDTO(4, "Honda","Civic", CarType.SEDAN));
        return carList;
    }
}