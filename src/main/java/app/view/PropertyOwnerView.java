package app.view;

import app.service.helpers.SetOwnerDocType;
import app.service.helpers.SetOwnerType;
import app.service.inputport.PropertyOwnerService;
import app.service.validations.FormTypeValidator;

import java.util.Date;

public class PropertyOwnerView{



    private final PropertyOwnerService propertyOwnerService;


    PropertyOwnerView(PropertyOwnerService propertyOwnerService){
        this.propertyOwnerService = propertyOwnerService;
    }


    public void createPropertyOwner(){


        int id = FormTypeValidator.intValidator("Ingrese el id del propietario");
        System.out.println("Ingrese el tipo de documento del propietario");
        String docType = SetOwnerDocType.getDocType();
        String name = FormTypeValidator.stringValidator("Ingrese el nombre del propietario");
        System.out.println("Ingrese el apellido del propietario");
        String lastName = FormTypeValidator.stringValidator("Ingrese el apellido del propietario");
        String phone = FormTypeValidator.stringValidator("Ingrese el telefono del propietario");
        String email = FormTypeValidator.stringValidator("Ingrese el email del propietario");
        String address = FormTypeValidator.stringValidator("Ingrese la direccion del propietario");
        String password = FormTypeValidator.stringValidator("Ingrese la contraseña del propietario");

        System.out.println("Ingrese la fecha de nacimiento del propietario (formato: yyyy-MM-dd)");
        Date birthDate = getBirthDateFromInput();
        System.out.println("Ingrese el tipo de propietario: 1. Direct Owner, 2. Property Manager, 3. Real Estate Agency");
        String ownerType = SetOwnerType.getOwnerType();

        propertyOwnerService.createPropertyOwner(id, docType, name, lastName, phone, email, address, password, birthDate, ownerType);

    }

    // Metodos Helper , luego se convertiran en metodos de la clase service para que sean llamados desde el controller

    public Date getBirthDateFromInput() {

        String birthDateString = FormTypeValidator.stringValidator("Ingrese la fecha de nacimiento del propietario (formato: yyyy-MM-dd): ");
        Date birthDate = null;
        try {
            birthDate = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(birthDateString);
        } catch (java.text.ParseException e) {
            System.out.println("Formato de fecha inválido. Por favor, ingrese la fecha en el formato correcto.");
        }
        return birthDate;
    }






}
