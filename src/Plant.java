public abstract class Plant {
    protected String name;
    protected Integer size;

    public Plant(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    public abstract Plant copy();

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
