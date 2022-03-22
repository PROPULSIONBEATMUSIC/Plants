import Abstract.AbstractOutdoorPlant;
import Plants.AloeOutdoor;
import Plants.ChamomileOutdoor;
import Types.Aloe;
import Types.Chamomile;
import Types.PlantFactory;

class OutdoorPlant extends AbstractOutdoorPlant implements PlantFactory {

    public OutdoorPlant(int size, String name) {
        super(size, name);
    }

    @Override
    public Aloe createAloe() {
        return new AloeOutdoor(10, "Aloe outdoor");
    }

    @Override
    public Chamomile createChamomile() {
        return new ChamomileOutdoor(3, "Chamomile outdoor");
    }
}
