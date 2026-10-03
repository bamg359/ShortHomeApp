package app.repository;

import app.domain.PropertyOwner;
import app.service.outputport.PropertyOwnerRepository;

import java.util.ArrayList;
import java.util.List;

public class PropertyOwnerRepositoryImpl implements PropertyOwnerRepository {

    List<PropertyOwner> owners = new ArrayList<>();

    @Override
    public PropertyOwner savePropertyOwner(PropertyOwner propertyOwner){

        owners.add(propertyOwner);

        return propertyOwner;
    }


    @Override
    public List<PropertyOwner> selectAllPropertyOwners() {

        return owners;
    }

    @Override
    public PropertyOwner selectPropertyOwnerById(int id) {
        return null;
    }

    @Override
    public PropertyOwner updatePropertyOwner(PropertyOwner propertyOwner) {
        return null;
    }

    @Override
    public void deletePropertyOwner(int id) {

    }
}
