package Plants;

import Abstract.AbstractIndoorPlant;
import Types.Aloe;

public class AloeIndoor extends AbstractIndoorPlant implements Aloe {

    public AloeIndoor(int size, String name) {
        super(size, name);

        System.out.println("\n" + "AloeIndoor created:"+"\n"+"SIZE: "+size +"\n"+"NAME: "+name);
    }
}
