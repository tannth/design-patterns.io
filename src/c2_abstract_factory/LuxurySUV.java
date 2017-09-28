package c2_abstract_factory;

public class LuxurySUV implements SUV {
    private String name;

    public LuxurySUV(String name) {
        this.name = name;
    }

    @Override
    public String getSUVName() {
        return name;
    }

    @Override
    public String getSUVFeatures() {
        return "Luxury SUV features";
    }
}
