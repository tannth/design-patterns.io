package c2_abstract_factory;

public class NonLuxurySUV implements SUV {
    private String name;

    public NonLuxurySUV(String name) {
        this.name = name;
    }


    @Override
    public String getSUVName() {
        return name;
    }

    @Override
    public String getSUVFeatures() {
        return "Non-Luxury SUV features";
    }
}
