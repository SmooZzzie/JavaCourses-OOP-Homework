package week2.library_task;

import java.util.ArrayList;

/**
 * Created by SmooZzzie on 27.04.2017.
 */
public class Reader {

    private static final int MAX_QUANTITY_OF_EDITIONS = 3;

    private String name;
    private String surname;
    private boolean isBanned;

    private ArrayList<Edition> readerEditions;

    public Reader() {
        name = "TestName";
        surname = "TestSurname";
        readerEditions = new ArrayList<>(MAX_QUANTITY_OF_EDITIONS);
    }

    public Reader(String name, String surname) {
        this.name = name;
        this.surname = surname;
        readerEditions = new ArrayList<>(MAX_QUANTITY_OF_EDITIONS);
    }
}
