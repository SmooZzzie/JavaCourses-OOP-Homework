package week2.library_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by SmooZzzie on 27.04.2017.
 */
public class Reader implements Comparable<Reader> {

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

    public Reader(String name, String surname, boolean isBanned) {
        this.name = name;
        this.surname = surname;
        this.isBanned = isBanned;
        readerEditions = new ArrayList<>(MAX_QUANTITY_OF_EDITIONS);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public ArrayList<Edition> getReaderEditions() {
        return readerEditions;
    }

    public boolean addEdition(Edition edition) {

        if (edition == null || edition.getQuantity() == 0 || isBanned == true)
            return false;

        readerEditions.add(edition);
        Collections.sort(readerEditions);

        edition.addReader(this);
        edition.setQuantity(edition.getQuantity() - 1);

        return true;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    @Override
    public String toString() {
        return name + " " + surname + " \t| in black list: " + ((isBanned) ? "yes;" : "no;");
    }

    @Override
    public int compareTo(Reader o) {
        return this.name.compareTo(o.name);
    }
}
