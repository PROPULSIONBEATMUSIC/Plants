import Types.PlantFactory;

public class Main {
    public static void main(String[] args) {
        PlantFactory indoor = new IndoorPlant(5, "IndoorPlant");
        indoor.createAloe();
        indoor.createChamomile();

        PlantFactory outdoor = new OutdoorPlant(8, "OutdoorPlant");
        outdoor.createAloe();
        outdoor.createChamomile();
    }
}