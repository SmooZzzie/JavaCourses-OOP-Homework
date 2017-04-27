package week2.library_task;

import java.util.ArrayList;

/**
 * Created by SmooZzzie on 27.04.2017.
 */
public abstract class Edition {

    private static final int DEFAULT_QUANTITY_OF_EDITION = 5;

    private String editionName;
    private int yearOfPublishing;
    private int quantity;

    private ArrayList<Reader> editionReaders;

    public Edition() {
        this.editionName = "TestEditionName";
        this.yearOfPublishing = 1111;
        this.quantity = DEFAULT_QUANTITY_OF_EDITION;
        editionReaders = new ArrayList<>(quantity);
    }

    public Edition(String editionName, int yearOfPublishing) {
        this.editionName = editionName;
        this.yearOfPublishing = yearOfPublishing;
        quantity = DEFAULT_QUANTITY_OF_EDITION;
        editionReaders = new ArrayList<>(quantity);
    }

    public Edition(String editionName, int yearOfPublishing, int quantity) {
        this.editionName = editionName;
        this.yearOfPublishing = yearOfPublishing;
        this.quantity = quantity;
        editionReaders = new ArrayList<>(quantity);
    }
}
