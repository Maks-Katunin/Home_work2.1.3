package com.company;

public class Main {

    public static void main(String[] args) {

        TunedCar carForMe = new TunedCar(CarBodyEnum.SEDAN, TypeOfFuelEnum.PETROL,
                new DeliveryAddress(CountryEnum.KYRGYZSTAN,
                "Bishkek", "Sadovaya 14 b"), CarColorEnum.SILVER,
                SteeringWheelEnum.LEFT, GearboxTypeEnum.MECHANICAL,
                InteriorUpholsteryEnum.NATURAL_LEATHER);
        System.out.println(carForMe.getInfo());
        System.out.println("-------------------------------------");


        SerialCar carForMyWife = new SerialCar(CarBodyEnum.MINIVAN, TypeOfFuelEnum.HYBRID,
                new DeliveryAddress(CountryEnum.KYRGYZSTAN,
                "Bishkek", "Sadovaya 14 b"), CarColorEnum.RED,
                SteeringWheelEnum.LEFT, GearboxTypeEnum.AUTOMATIC,
                InteriorUpholsteryEnum.NATURAL_LEATHER);
        System.out.println(carForMyWife.getInfo());
        System.out.println("------------------------------------");

    }
}
