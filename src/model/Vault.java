package model;

import java.util.HashMap;
import java.util.Map;

public class Vault {

    private Map mPasswords = new HashMap();

    public Vault(){ }


    // REQUIRES: Two strings: a key and a password.
    // MODIFIES: this
    // EFFECTS: Adds a new password to the list of passwords
    public void addNewPassword(String key, String password){
        mPasswords.put(key, password);
    }

    // todo : remove password method
    // todo : get a list of all passwords and keys
    public Map getmPasswordList(){
        return mPasswords;
    }

}
