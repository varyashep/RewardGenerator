import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        //List<ItemGenerator> itemGeneratorList = new ArrayList<>();

        Random random = ThreadLocalRandom.current();

        List<ItemGenerator> fabrics = initFabrics();
        for (int i = 0; i < 200; i++) {
            int index = random.nextInt(fabrics.size());
            fabrics.get(index).openReward();
        }
    }

    public static List<ItemGenerator> initFabrics() {
        List<ItemGenerator> fabrics = new ArrayList<>();
        fabrics.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            fabrics.add(new GoldGenerator());
        }
        for (int i = 0; i < 10; i++) {
            fabrics.add(new SilverGenerator());
            fabrics.add(new StoneGenerator());
            fabrics.add(new IronGenerator());
            fabrics.add(new FoodGenerator());
            fabrics.add(new EmeraldGenerator());
            fabrics.add(new CoalGenerator());
        }

        return fabrics;
    }
}