import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        IndoorPlant[] aloeIndoorList = {
//          new AloeIndoorPlant("Aloe Indoor", 10),
//          new RoseIndoorPlant("Rose Indoor", 6)
//        };
//        OutdoorPlant[] aloeOutdoorList = {
//                new AloeOutdoorPlant("Aloe Outdoor", 20),
//                new RoseOutdoorPlant("Rose Outdoor", 12)
//        };
//        Arrays.stream(aloeIndoorList).forEach(e -> e.showIndoor());
//        Arrays.stream(aloeOutdoorList).forEach(e -> e.showOutdoor());
        IndoorFactory indoorFactory = new IndoorFactory();
        indoorFactory.createAloe().showInfo();
        indoorFactory.createRose().showInfo();
        OutdoorFactory outdoorFactory = new OutdoorFactory();
        outdoorFactory.createAloe().showInfo();
        outdoorFactory.createRose().showInfo();
    }
}