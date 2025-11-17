package FitnessTracker;

public abstract class IndividualDetails {
    private String name;
    private int age;
    private double weight;
    private double height;

    public IndividualDetails(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) throws InvalidHealthException {
        if (weight <= 0) {
            throw new InvalidHealthException("Weight cannot be 0");
        }
        this.weight = weight;
    }

    public void setHeight(double height) throws InvalidHealthException {
        if (height <= 0) {
            throw new InvalidHealthException("Height cannot be 0");
        }
        this.height = height;
    }

    public abstract void displayHealthSummary();
}
