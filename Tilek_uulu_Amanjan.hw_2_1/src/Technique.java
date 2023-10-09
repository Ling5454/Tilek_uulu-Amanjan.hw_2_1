public class Technique {
    private int yearOfManufacture;
    private TypeTechnique typeTechnique;
    private Shop shop;

    public Technique(int yearOfManufacture, TypeTechnique typeTechnique, Shop shop) {
        this.yearOfManufacture = yearOfManufacture;
        this.typeTechnique = typeTechnique;
        this.shop = shop;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public TypeTechnique getTypeTechnique() {
        return typeTechnique;
    }

    public Shop getShop() {
        return shop;
    }
    public String getInfo(){
        return "\nTypeTechnique: " + typeTechnique +
                "\nYearOfManufacture: " + yearOfManufacture +
                "\nShopname: " + shop.getName() +
                "\nShopaddress: " + shop.getAddress();
    }
}
