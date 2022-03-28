public class IndoorFactory extends IndoorAbstractFactory {
    public IndoorPlant createAloe() {
        return new AloeIndoorPlant("aloe", 10);
    }

    public IndoorPlant createAloe(IndoorPlant prototype) {
        return new AloeIndoorPlant(prototype);
    }

    public IndoorPlant createRose() {
        return new RoseIndoorPlant("rose", 20);
    }

    public IndoorPlant createRose(IndoorPlant prototype) {
        return new RoseIndoorPlant(prototype);
    }

}