package oop_inheritance;

import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {

        System.out.println("HW_inheritance");

        Car car1 = new Car("Lada", "Granta", 2015, "России", "желтого", 1.7, "механическая", "универсал", "х337ас152", 5, false, 100, "100,00");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черного", 3.0, "автоматическая", "хэчбэк", "м645вв799", 5, false, 100, "99.23");
        Car car3 = new Car("BMW", "Z8", 2015, "Германии", "черного", 3.0, "роботизированная", "седан", "к876от001", 2, false, 100, "89,45");
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красного", 3.0, "вариатор", "паркетник", "е645кх199", 5, false, 100, "78,95");
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевого", 1.6, "автоматическая", "седан", "р534ак163", 5, false, 100, "78,67");
        printInfo(car1);
        printInfo(car2);
        printInfo(car3);
        printInfo(car4);
        printInfo(car5);
        System.out.println("Заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках");


        System.out.println(" ");

        Train trainLastochka = new Train(3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11, "Ласточка", "B-901", 2011, "Россия", null, 301, "90.01");
        Train trainLeningrad = new Train(1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, "Ленинград", "D-125", 2019, "Россия", null, 270, "99.99");
        printInfo(trainLastochka);
        printInfo(trainLeningrad);
        System.out.println("Заправлять дизелем");

        System.out.println(" ");

        Bus bas1 = new Bus("ПАЗ", "Вектор Next", 2018, "Россия", "синий", 80, "98,09");
        Bus bas2 = new Bus("ЛиАЗ", "5256", 2014, "Россия", "белый", 100, "76,56");
        Bus bas3 = new Bus("VolgaBus", "ДЕЛЬТА", 2021, "Россия", "желтый", 120, "67.78");
        printInfo(bas1);
        printInfo(bas2);
        printInfo(bas3);
        System.out.println("Заправлять бензином или дизелем на заправке");
    }

    public static void printInfo(Car car) {
        System.out.println(
                "Автомобиль: " + car.getBrand() + " " + car.getModel() + ", " + car.getYear() +
                        " год выпуска, сборка в " + car.getCountry() + ", " + car.getColor() +
                        " цвета, объем двигателя: " + car.getEngineVolume() +
                        " л., трансмиссия: " + car.getTransmission() +
                        ", кузов: " + car.getBodyType() +
                        ", регистрационный номер: " + car.getRegistrationNumber() +
                        ", количество мест: " + car.getNumberOfSeats() +
                        ", " + (car.isCorrectRegistrationNumber() ? "летняя" : "зимняя") +
                        " резина, количество топлива " + car.getFuelPercentage() +
                        "%."
        );
    }

    public static void printInfo(Train train) {
        System.out.println(
                "Поезд " + train.getBrand() +
                        ", модель " + train.getModel() +
                        ", " + train.getYear() +
                        " года выпуска, страна производства " + train.getCountry() +
                        ", скорость передвижения " + train.getMaxSpeed() +
                        ", отходит от " + train.getDepartureStationName() +
                        ", следует до станции " + train.getFinalStop() +
                        ". Цена поездки " + train.getTripPrice() +
                        ", в поезде " + train.getNumberOfCar() +
                        " вагонов, количество топлива " + train.getFuelPercentage() +
                        "%."
        );
    }

    public static void printInfo(Bus bus) {
        System.out.println("Автобус " + bus.getBrand() +
                ", модель " + bus.getModel() +
                ", год выпуска " + bus.getYear() +
                ", страна производства " + bus.getCountry() +
                ", цвет " + bus.getColor() +
                ", максимальная скорость " + bus.getMaxSpeed() +
                ", количество топлива " + bus.getFuelPercentage() +
                "%."
        );
    }


}