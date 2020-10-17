package ru.basejava.resume.storage;

import ru.basejava.resume.model.Resume;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage extends AbstractArrayStorage {

    // Implement step from Template Method 1 from AbstractArrayStorage
    @Override
    protected int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].toString().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }

    // Implement step from Template Method 2 from AbstractArrayStorage
    @Override
    protected void saveAt(Resume resume, int index) {
        storage[size] = resume;
    }

    // Implement step from Template Method 3 from AbstractArrayStorage
    @Override
    protected void deleteAt(int index) {
        storage[index] = storage[size - 1];
        storage[size - 1] = null;
    }
}
