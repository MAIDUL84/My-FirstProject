package com.miraz.hudson;

public class MirazDelaware {


    public static void main(String[] args) {

        MirazHouse abc = new MirazHouse();
        abc.houseNumber = "23";
        abc.streetName = "martin drive";
        //System.out.println("housenumber:" + abc.houseNumber + "," + abc.cityName);
        abc.cityName = "newark";
        abc.stateName = "delaware";
        abc.zipCode = "12345";

        System.out.println("myhouse:" + abc.houseNumber + "," + abc.streetName + "," + abc.cityName +
                "," + abc.stateName + "," + abc.zipCode + ".");







    }
}
