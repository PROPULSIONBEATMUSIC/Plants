public abstract class OutdoorPlant extends Plant {
    protected final String type = "outdoor";
    public OutdoorPlant(String name, Integer size) {
        super(name, size);
    }

    public void showInfo(){
        System.out.println("NAME: " + name + "\n" + "SIZE: " + size + "\n" + "TYPE: " + type + "\n");
    };

    @Override
    public String toString() {
        return "OutdoorPlant{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}