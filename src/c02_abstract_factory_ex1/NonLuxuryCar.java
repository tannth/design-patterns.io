package c02_abstract_factory_ex1;

public class NonLuxuryCar implements Car {

    private String name;

    public NonLuxuryCar(String name) {
        this.name = name;
    }

    @Override
    public String getCarName() {
        return name;
    }

    @Override
    public String getCarFeatures() {
        return "Non-Luxury Car Features ";
    }
}
