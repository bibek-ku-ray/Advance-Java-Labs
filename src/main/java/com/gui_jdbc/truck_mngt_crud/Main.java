package com.gui_jdbc.truck_mngt_crud;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TruckService truckService = new TruckService();

        Truck tata = new Truck(
                "TATA", "2020", 1200, "Bahadur");
        Truck mahindra = new Truck(
                "Mahindra", "2023", 1000, "Smith");
        Truck volvo = new Truck(
                "Volvo", "2022", 1500, "Warner");
        // add
        truckService.addTruck(tata);
        truckService.addTruck(mahindra);
        truckService.addTruck(volvo);

        //fetch

        Truck truck = truckService.getTruckById(2);
        System.out.println("Truck: "+ truck);

        //update
        truck.setDriverName("David");
        truckService.updateTruckById(truck);
        System.out.println("Updated truck info: "+ truckService.getTruckById(2));

        //get all trucks
        List<Truck> allTrucks = truckService.getAllTruck();
        System.out.println("All Truck: ");
        for(Truck truck1: allTrucks){
            System.out.println(truck1);
        }

        //delete data
        truckService.deleteTruckById(3);
        System.out.println("truck data deleted");

        allTrucks=truckService.getAllTruck();
        System.out.println("After all operation");
        System.out.println(allTrucks);
    }
}
