package ru.basejava.resume.storage;

import ru.basejava.resume.model.Resume;

import java.util.Arrays;

public abstract class AbstractArrayStorage extends AbstractStorage {
    static final int CAPACITY = 10_000;
    final Resume[] storage = new Resume[CAPACITY];
    int size = 0;

    @Override
    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    abstract void shiftAt(int index);

    @Override
    boolean checkCapacity() {
        return size == CAPACITY;
    }

    @Override
    void resize(int delta) {
        size += delta;
    }

    @Override
    void deleteAt(int index) {
        shiftAt(index);
        storage[size - 1] = null;
    }

    @Override
    void updateAt(Resume resume, int index) {
        storage[index] = resume;
    }

    @Override
    Resume getAt(int index) {
        return storage[index];
    }

    @Override
    Resume[] storageCopy() {
        return Arrays.copyOf(storage, size);
    }
}
