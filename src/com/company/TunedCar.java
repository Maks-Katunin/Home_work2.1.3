package com.company;

import java.util.Random;

public final class TunedCar extends SerialCar{
    private double engineVolume = generateEngineVolume();
    private int enginePower = generateEnginePower();
    private String turbineAvailability = turbineAvailabilityVariants();


    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nОбъём двигателя: " + generateEngineVolume() +
                "\nМощность двигателя: " + generateEnginePower() +
                "\nМаксимальная скорость: " + generateMaximumSpeed() + " км/ч " +
                "\nНаличие турбины: " + turbineAvailability;
    }

    private double generateEngineVolume() {
        Random random = new Random();
        return random.nextInt(4) + 1.8;
    }

    private int generateEnginePower() {
        Random random = new Random();
        return random.nextInt(151) + 330;
    }

    private int generateMaximumSpeed() {
        Random random = new Random();
        return random.nextInt(100) + 180;
    }

    private String turbineAvailabilityVariants() {
        this.turbineAvailability = turbineAvailability;
        if (enginePower > 280 && engineVolume > 2.2) {
            turbineAvailability = "YES";
        } else turbineAvailability = "NO";
        return turbineAvailability;
    }


    public TunedCar(
            CarBodyEnum carBodyEnum,
            TypeOfFuelEnum typeOfFuelEnum,
            DeliveryAddress deliveryAddress,
            CarColorEnum colorEnum,
            SteeringWheelEnum steeringWheelEnum,
            GearboxTypeEnum gearboxTypeEnum,
            InteriorUpholsteryEnum interiorUpholsteryEnum
    ) {

        super(carBodyEnum, typeOfFuelEnum, deliveryAddress, colorEnum,
                steeringWheelEnum, gearboxTypeEnum, interiorUpholsteryEnum);


    }

}
