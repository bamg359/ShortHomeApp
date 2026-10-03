package app;

import app.configuration.Config;
import app.userinterface.UserInterface;

public class App {


    public static void main(String[] args){


        UserInterface userInterface = Config.createUserInterface();
        userInterface.menuApp();


    }

}
