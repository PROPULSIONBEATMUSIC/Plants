public class RoseOutdoorPlant extends OutdoorPlant{
    public RoseOutdoorPlant(String name, Integer size) {
        super(name, size);
    }

    @Override
    public Plant copy() {
        RoseOutdoorPlant roseOutdoorPlantCopy = new RoseOutdoorPlant(name, size);
        roseOutdoorPlantCopy.copy();
        return roseOutdoorPlantCopy;
    }

    public RoseOutdoorPlant(OutdoorPlant prototype) {
        super(prototype.getName(), prototype.getSize());
    }

}