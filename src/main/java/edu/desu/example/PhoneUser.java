package edu.desu.example;

import java.util.ArrayList;

public class PhoneUser {


    public String makeACall(Phone phone){
        phone.calling();
        return "Ring Ring";
    }

    public static void main(String[] args) {
        PhoneUser phoneUser = new PhoneUser();
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Iphone());
        phones.add(new Android());

        for(int x = 0; x < phones.size(); x++){


            Phone phone = phones.get(x);
            phoneUser.makeACall(phone);
        }

    }
}
