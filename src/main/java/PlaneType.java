public enum PlaneType {

    BOEING747(467, 800000.00),
    MERCURE(160, 146000.00),
    PIPERM350(5, 4340.00);

    private final int capacity;
    private final double weight;

    PlaneType(int capacity, double weight){
        this.capacity = capacity;
        this.weight = weight;
    }
    public int getCapacity(){
        return this.capacity;
    }

    public double getWeight() {
        return weight;
    }
}
