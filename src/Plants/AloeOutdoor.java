package Plants;

import Abstract.AbstractOutdoorPlant;
import Types.Aloe;

public class AloeOutdoor extends AbstractOutdoorPlant implements Aloe {

    public AloeOutdoor(int size, String name) {
        super(size, name);
        System.out.println("\n" + "AloeOutdoor created:"+"\n"+"SIZE: "+size +"\n"+"NAME: "+name);
    }
}