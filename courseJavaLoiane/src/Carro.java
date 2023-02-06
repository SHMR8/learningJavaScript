public class Carro {
    private String name;
    private String model;
    private int maxVelocity;
    private int fuelCapacity;

    public Carro() {
    }

    public Carro(String name, String model, int maxVelocity, int fuelCapacity) {
        this.name = name;
        this.model = model;
        this.maxVelocity = maxVelocity;
        this.fuelCapacity = fuelCapacity;
    }

    public String name() {
        return name;
    }

    public String model() {
        return model;
    }

    public int maxVelocity(int i) {
        return maxVelocity;
    }

    public int fuelCapacity() {
        return fuelCapacity;
    }

    public Carro setName(String name) {
        this.name = name;
        return this;
    }

    public Carro setModel(String model) {
        this.model = model;
        return this;
    }

    public Carro setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
        return this;
    }

    public Carro setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        return this;
    }
}
