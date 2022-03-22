package Plants;

import Abstract.AbstractOutdoorPlant;
import Types.Chamomile;

public class ChamomileOutdoor extends AbstractOutdoorPlant implements Chamomile {

    public ChamomileOutdoor(int size, String name) {
        super(size, name);
        System.out.println("\n" + "ChamomileOutdoor created:"+"\n"+"SIZE: "+size +"\n"+"NAME: "+name);
    }
}
