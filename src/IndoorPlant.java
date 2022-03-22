import Abstract.AbstractIndoorPlant;
import Plants.AloeIndoor;
import Plants.ChamomileIndoor;
import Types.Aloe;
import Types.Chamomile;
import Types.PlantFactory;

class IndoorPlant extends AbstractIndoorPlant implements PlantFactory {

    public IndoorPlant(int size, String name) {
        super(size, name);
    }

    public void ShowInfo(){
        System.out.println("Size: " + size + "\n" + "Name: " + name + "\n");
    }

    @Override
    public Aloe createAloe() {
        return new AloeIndoor(3, "Aloe indoor");
    }

    @Override
    public Chamomile createChamomile() {
        return new ChamomileIndoor(1, "Chamomile indoor");
    }

    @Override
    public Object clone() {
        return new IndoorPlant(10, "indoorCopy");
    }
}

//создаешь класс фабрики, там делаешь стандартную реализацию 3 метода
//createIndoorAloe
//createOutdoorAloe
//затем создать методы
//createIndoorAloe (prototype from parent object)
//createOutdoorAloe (prototype from parent object)
