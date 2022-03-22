package Types;

import Types.Aloe;
import Types.Chamomile;

public interface PlantFactory {
    Aloe createAloe();
    Chamomile createChamomile();
}