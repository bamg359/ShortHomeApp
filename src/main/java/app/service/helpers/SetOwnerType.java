package app.service.helpers;

import app.domain.enums.OwnerTypeEnum;
import app.service.validations.FormTypeValidator;

public class SetOwnerType {

    public static String getOwnerType(){

        int option = FormTypeValidator.intValidator("1.Propietario directo" +
                "Administrador" +
                "Agencia de Arrendamiento");
        String value = "";
        switch (option){
            case 1:
                value = OwnerTypeEnum.DIRECT_OWNER.getValue();
                break;
            case 2:
                value = OwnerTypeEnum.PROPERTY_MANAGER.getValue();
                break;
            case 3:
                value = OwnerTypeEnum.REAL_ESTATE_AGENCY.getValue();
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
        return value;
    }
}
