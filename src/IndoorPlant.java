public abstract class IndoorPlant extends Plant {
    protected final String type = "indoor";
    public IndoorPlant(String name, Integer size) {
        super(name, size);
    }

    public void showInfo(){
        System.out.println("NAME: " + name + "\n" + "SIZE: " + size + "\n" + "TYPE: " + type + "\n");
    }

    @Override
    public String toString() {
        return "IndoorPlant{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}