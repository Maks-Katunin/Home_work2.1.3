package com.company;

public class Auto {
    private CarBodyEnum carBodyEnum;
    private TypeOfFuelEnum typeOfFuelEnum;
    private DeliveryAddress deliveryAddress;

    public Auto(CarBodyEnum carBodyEnum, TypeOfFuelEnum typeOfFuelEnum, DeliveryAddress deliveryAddress) {
        this.carBodyEnum = carBodyEnum;
        this.typeOfFuelEnum = typeOfFuelEnum;
        this.deliveryAddress = deliveryAddress;
    }

    public CarBodyEnum getCarBodyEnum() {
        return carBodyEnum;
    }

    public TypeOfFuelEnum getTypeOfFuelEnum() {
        return typeOfFuelEnum;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getInfo() {
        return "Доставить автомобиль по адресу: " +
                "\nСтрана: " + deliveryAddress.getCountryEnum() +
                "\nГород: " + deliveryAddress.getCity() +
                "\nУлица и номер дома: " + deliveryAddress.getStreet() +
                "\nсо следующими параметрами: " +
                "\nТип кузова: " + carBodyEnum +
                "\nВид Топлива: " + typeOfFuelEnum;
    }


}
