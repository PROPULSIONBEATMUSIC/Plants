package Plants;

import Abstract.AbstractIndoorPlant;
import Types.Chamomile;

public class ChamomileIndoor extends AbstractIndoorPlant implements Chamomile {

    public ChamomileIndoor(int size, String name) {
        super(size, name);
        System.out.println("\n" + "ChamomileIndoor created:"+"\n"+"SIZE: "+size +"\n"+"NAME: "+name);
    }
}
