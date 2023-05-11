package program;

public class Car {
    private int id;
    private String carType;
    private String carModel;
    private String manufacture;
    private String color;
    private int engineCapacity;

    public Car(int id, String carType, String carModel, String manufacture, String color, int engineCapacity) {
        this.id = id;
        this.carType = carType;
        this.carModel = carModel;
        this.manufacture = manufacture;
        this.color = color;
        this.engineCapacity = engineCapacity;
    }

    public int getId() {
        return id;
    }

    public String getCarType() {
        return carType;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getColor() {
        return color;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}
