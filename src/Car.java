public class Car {
    private int price;
    private int engineSize;
    private int maxSpeed;

    public Car(int price, int engineSize) {
        this.price = price;
        this.engineSize = engineSize;
    }

    public Car(int price, int engineSize, int maxSpeed) {
        this.price = price;
        this.engineSize = engineSize;
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{"+
                "Price="+price+
                ", engineSize="+engineSize+
                "}";
    }
}
