package app.view;

import app.service.PropertyOwnerServiceImpl;

import java.util.Scanner;

public class PropertyView {

    Scanner sc = new Scanner(System.in);

    private final PropertyOwnerServiceImpl propertyOwnerService;

    PropertyView(PropertyOwnerServiceImpl propertyOwnerServiceImpl){
        this.propertyOwnerService = propertyOwnerServiceImpl;
    }


    public void createProperty(){

        System.out.println("Ingrese el id de la propiedad: ");

    }

    public void selectPropertyById(int id){

    }

    public void selectAllProperties(){

    }

    public void updateProperty(){

    }

    public void deleteProperty(int id){

    }
}
