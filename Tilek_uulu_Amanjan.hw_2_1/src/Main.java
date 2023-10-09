public class Main {
    public static void main(String[] args) {
       Shop shop = new Shop("Technomir","Ahmatbeka 140/2");
       Automobile automobile = new Automobile(2020, TypeTechnique.ROAD,shop,"Kia k7");
       Automobile automobile2 = new Automobile(2012, TypeTechnique.ROAD,shop,"Sonata");
       Computer computer = new Computer(2018,TypeTechnique.COMPUTING,shop,"Latitude E6410","ALEXNOUT",8);
        System.out.println(automobile.getInfo());
        System.out.println("----");
        System.out.println(automobile2.getInfo());
        System.out.println("----");
        System.out.println(computer.getInfo());
        System.out.println("----");
        automobile.method();
        System.out.println("----");
        automobile2.method("Sonata продан !");
    }
}