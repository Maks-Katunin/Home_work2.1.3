package com.company;

public class SerialCar extends Auto {
    private CarColorEnum colorEnum;
    private SteeringWheelEnum steeringWheelEnum;
    private GearboxTypeEnum gearboxTypeEnum;
    private InteriorUpholsteryEnum interiorUpholsteryEnum;

    public SerialCar(CarBodyEnum carBodyEnum, TypeOfFuelEnum typeOfFuelEnum, DeliveryAddress deliveryAddress,
                     CarColorEnum colorEnum, SteeringWheelEnum steeringWheelEnum, GearboxTypeEnum gearboxTypeEnum,
                     InteriorUpholsteryEnum interiorUpholsteryEnum) {
        super(carBodyEnum, typeOfFuelEnum, deliveryAddress);
        this.colorEnum = colorEnum;
        this.steeringWheelEnum = steeringWheelEnum;
        this.gearboxTypeEnum = gearboxTypeEnum;
        this.interiorUpholsteryEnum = interiorUpholsteryEnum;
        super.getCarBodyEnum();
        super.getTypeOfFuelEnum();
        super.getDeliveryAddress();
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nЦвет кузова: " + colorEnum +
                "\nРасположение руля: " +
                "\nТип КПП: " + gearboxTypeEnum +
                "\nОбшивка салона " + interiorUpholsteryEnum;
    }
}
