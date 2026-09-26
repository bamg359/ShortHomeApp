package app.service;

import app.domain.PropertyOwner;
import app.repository.PropertyOwnerRepositoryImpl;
import app.service.inputport.PropertyOwnerService;
import app.service.outputport.PropertyOwnerRepository;

import java.util.Date;
import java.util.List;

public class PropertyOwnerServiceImpl implements PropertyOwnerService {


    private final PropertyOwnerRepository propertyOwnerRepository;

    public PropertyOwnerServiceImpl(PropertyOwnerRepository propertyOwnerRepository){
        this.propertyOwnerRepository = propertyOwnerRepository;
    }


    public PropertyOwner createPropertyOwner(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthDate, String ownerType){
        PropertyOwner propertyOwner = new PropertyOwner(id,docType,name,lastName,phone,email,address, password,birthDate,ownerType);
        return propertyOwnerRepository.savePropertyOwner(propertyOwner);
    }

    @Override
    public PropertyOwner selectOwnerById(int id) {
        return null;
    }

    @Override
    public List<PropertyOwner> selectAllOwners() {
        return propertyOwnerRepository.selectAllPropertyOwners();

    }

    @Override
    public PropertyOwner updatePropertyOwner(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthDate, String ownerType) {
        return null;
    }

    @Override
    public void deleteOwner(int id) {

    }
}
