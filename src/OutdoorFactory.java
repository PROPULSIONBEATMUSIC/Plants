public class OutdoorFactory extends OutdoorAbstractFactory{
    @Override
    public OutdoorPlant createAloe() {
        return new AloeOutdoorPlant("aloe", 10);
    }

    @Override
    public OutdoorPlant createAloe(OutdoorPlant prototype) {
        return new AloeOutdoorPlant(prototype);
    }

    @Override
    public OutdoorPlant createRose() {
        return new RoseOutdoorPlant("rose", 20);
    }

    @Override
    public OutdoorPlant createRose(OutdoorPlant prototype) {
        return new RoseOutdoorPlant(prototype);
    }
}
