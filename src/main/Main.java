package main;

import model.Vault;
import ui.Window;

public class Main {

    public static void main(String[] args) {

        Vault mVault = new Vault();
        mVault.addNewPassword("rat_cage", "neil");

        System.out.println(mVault.getmPasswordList());

        // create window
        Window mWindow = new Window();
        mWindow.createStartMenu();



    }

}
