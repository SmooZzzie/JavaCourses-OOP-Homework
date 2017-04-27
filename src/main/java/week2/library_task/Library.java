package week2.library_task;

import week2.interfaces.booksInterfaces.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by SmooZzzie on 27.04.2017.
 */
public class Library {

    private static final int MAX_QUANTITY_OF_READERS = 1000;
    private static final int MAX_QUANTITY_OF_EDITIONS = 10000;

    private ArrayList<Reader> readersList = new ArrayList<>(MAX_QUANTITY_OF_READERS);
    private ArrayList<Edition> editionsList = new ArrayList<>(MAX_QUANTITY_OF_EDITIONS);

    private Comparator <Reader> readerComparator;
    private Comparator <Edition> editionComparator;

    public void setReaderComparator(Comparator<Reader> readerComparator) {
        this.readerComparator = readerComparator;
    }

    public void setEditionComparator(Comparator<Edition> editionComparator) {
        this.editionComparator = editionComparator;
    }
}
