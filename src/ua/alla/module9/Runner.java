package ua.alla.module9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arlekino on 1/29/2016.
 */
public class Runner {
    public static void main (String [] args) {
        final List<MusInstrument> collectionsList = new ArrayList<>();
        collectionsList.add (new MusInstrument("Гитара", "Yellow", (double) 20.00));
        collectionsList.add (new MusInstrument("Труба", "Grey", (double) 37.50));
        collectionsList.add (new MusInstrument("Скрипка", "Black", (double) 47.99));
        collectionsList
                .stream()
                .map( collections-> collections.getName())
                .forEach(musicalInstrument -> System.out.println(musicalInstrument));

    }
}
