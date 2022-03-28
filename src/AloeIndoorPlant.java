public class AloeIndoorPlant extends IndoorPlant {
    public AloeIndoorPlant(String name, Integer size) {
        super(name, size);
    }

    public void showInfo(){
        System.out.println("NAME: " + name + "\n" + "SIZE: " + size + "\n" + "TYPE: " + type + "\n");
    };

    @Override
    public Plant copy() {
        AloeIndoorPlant aloeIndoorPlantCopy = new AloeIndoorPlant(name, size);
        aloeIndoorPlantCopy.copy();
        return aloeIndoorPlantCopy;
    }

    public AloeIndoorPlant(IndoorPlant prototype) {
        super(prototype.getName(), prototype.getSize());
    }

    @Override
    public String toString() {
        return "AloeIndoorPlant{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}