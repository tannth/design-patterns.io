package c02_abstract_factory_ex1;

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
