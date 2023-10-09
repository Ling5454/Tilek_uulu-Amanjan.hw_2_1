public final class Computer extends Automobile {
    private String name;
    private int memory;

    public Computer(int yearOfManufacture, TypeTechnique typeTechnique, Shop shop, String model, String name, int memory) {
        super(yearOfManufacture, typeTechnique, shop, model);
        this.name = name;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public int getMemory() {
        return memory;
    }
    @Override
    public String getInfo(){
        return super.getInfo() +
                "\nName: " + name +
                "\nMemory: " + memory;
    }
}
