public class Automobile extends Technique{
    private String model;

    public Automobile(int yearOfManufacture, TypeTechnique typeTechnique, Shop shop, String model) {
        super(yearOfManufacture, typeTechnique, shop);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public final void method(){
        System.out.println("Привозной автомобиль из Кореи");
    }
    public void method(String method){
        System.out.println(method);
    }
    @Override
    public String getInfo(){
        return super.getInfo() +
                "\nmodel: " + model;
    }
}
