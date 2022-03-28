public class RoseIndoorPlant extends IndoorPlant{
    public RoseIndoorPlant(String name, Integer size) {
        super(name, size);
    }

    public void showInfo(){
        System.out.println("NAME: " + name + "\n" + "SIZE: " + size + "\n" + "TYPE: " + type + "\n");
    };

    @Override
    public Plant copy() {
        RoseIndoorPlant roseIndoorPlantCopy = new RoseIndoorPlant(name, size);
        roseIndoorPlantCopy.copy();
        return roseIndoorPlantCopy;
        }

    public RoseIndoorPlant(IndoorPlant prototype) {
        super(prototype.getName(), prototype.getSize());
    }

}