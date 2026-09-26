package app.service.outputport;

import app.domain.PropertyOwner;

import java.util.List;

public interface PropertyOwnerRepository {

    public PropertyOwner savePropertyOwner(PropertyOwner propertyOwner);
    public List<PropertyOwner> selectAllPropertyOwners();
    public PropertyOwner selectPropertyOwnerById(int id);
    public PropertyOwner updatePropertyOwner(PropertyOwner propertyOwner);
    public void deletePropertyOwner(int id);

}
