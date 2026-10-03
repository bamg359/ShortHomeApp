package app.configuration;

import app.repository.PropertyOwnerRepositoryImpl;
import app.service.PropertyOwnerServiceImpl;
import app.service.inputport.PropertyOwnerService;
import app.service.outputport.PropertyOwnerRepository;
import app.userinterface.UserInterface;
import app.view.PropertyOwnerView;

public class Config {

    public static UserInterface createUserInterface() {

        PropertyOwnerRepository propertyOwnerRepository = new PropertyOwnerRepositoryImpl();
        PropertyOwnerService propertyOwnerService = new PropertyOwnerServiceImpl(propertyOwnerRepository);
        PropertyOwnerView propertyOwnerView = new PropertyOwnerView(propertyOwnerService);

        return new UserInterface(propertyOwnerView);


    }
}
