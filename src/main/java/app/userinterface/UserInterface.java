package app.userinterface;

import app.repository.PropertyOwnerRepositoryImpl;
import app.service.PropertyOwnerServiceImpl;
import app.service.inputport.PropertyOwnerService;
import app.service.outputport.PropertyOwnerRepository;
import app.service.validations.FormTypeValidator;
import app.view.PropertyOwnerView;

public class UserInterface {

    PropertyOwnerRepository propertyOwnerRepository = new PropertyOwnerRepositoryImpl();
    PropertyOwnerService propertyOwnerService = new PropertyOwnerServiceImpl(propertyOwnerRepository);
    PropertyOwnerView propertyOwnerView = new PropertyOwnerView(propertyOwnerService);


    public void menuApp(){

        int init = FormTypeValidator.intValidator("Presione 1 para inciar la aplicacion");

        while(init!=0){

            int option = FormTypeValidator.intValidator("""
                        Seleccione:
                        1.Registrar
                        2.Consultar todos los usuarios
                    """);

            switch (option){
                case 1:
                    System.out.println("Registrar");
                    propertyOwnerView.createPropertyOwner();
                    break;
                case 2:
                    System.out.println("Listar todos los usuarios");
                    propertyOwnerView.showAllPropertiesOwners();
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }
}
