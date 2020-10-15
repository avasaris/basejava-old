package ru.basejava.resume;

import ru.basejava.resume.model.Resume;
import ru.basejava.resume.storage.ArrayStorage;
import ru.basejava.resume.storage.Storage;

/**
 * Test for your ru.basejava.resume.storage.ArrayStorage implementation
 */
public class MainTestArrayStorage {
    static final Storage ARRAY_STORAGE = new ArrayStorage();

    public static void main(String[] args) {
        Resume r1 = new Resume();
        r1.setUuid("uuid1");
        Resume r2 = new Resume();
        r2.setUuid("uuid2");
        Resume r3 = new Resume();
        r3.setUuid("uuid3");

        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r3);

        System.out.println("Get r1: " + ARRAY_STORAGE.get(r1.getUuid()));
        System.out.println("Size: " + ARRAY_STORAGE.size());

        System.out.println("Get dummy: " + ARRAY_STORAGE.get("dummy"));

        printAll();
        System.out.println("\nDelete r1");
        ARRAY_STORAGE.delete(r1.getUuid());
        printAll();
        System.out.println("\nUpdate r1");
        ARRAY_STORAGE.update(r1);
        printAll();
        System.out.println("\nUpdate r2");
        ARRAY_STORAGE.update(r2);
        printAll();
        System.out.println("\nClear storage");
        ARRAY_STORAGE.clear();
        printAll();

        System.out.println("Size: " + ARRAY_STORAGE.size());
    }

    static void printAll() {
        System.out.println("\nGet All");
        for (Resume r : ARRAY_STORAGE.getAll()) {
            System.out.println(r);
        }
    }
}