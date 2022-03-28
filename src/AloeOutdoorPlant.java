public class AloeOutdoorPlant extends OutdoorPlant{
    public AloeOutdoorPlant(String name, Integer size) {
        super(name, size);
    }

    @Override
    public Plant copy() {
        AloeOutdoorPlant aloeOutdoorPlantCopy = new AloeOutdoorPlant(name, size);
        aloeOutdoorPlantCopy.copy();
        return aloeOutdoorPlantCopy;
    }

    public AloeOutdoorPlant(OutdoorPlant prototype) {
        super(prototype.getName(), prototype.getSize());
    }

}