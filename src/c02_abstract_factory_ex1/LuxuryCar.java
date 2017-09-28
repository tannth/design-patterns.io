package c02_abstract_factory_ex1;

public class LuxuryCar implements Car {

    private String name;

    public LuxuryCar(String name) {
        this.name = name;
    }

    @Override
    public String getCarName() {
        return name;
    }

    @Override
    public String getCarFeatures() {
        return "Luxury Car Features ";
    }
}
