package ru.mipt.java2016.homework.g597.dmitrieva.task2;

import ru.mipt.java2016.homework.tests.task2.StudentKey;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by macbook on 30.10.16.
 */

public class StudentKeySerialization extends SerializationStrategy<StudentKey> {
    @Override
    public StudentKey read(RandomAccessFile file) throws IOException {
        try {
            //StudentKey key = );
            return new StudentKey(file.readInt(), file.readUTF());
        } catch (IOException e) {
            throw new IOException("An I/O error occurred");
        }
    }

    @Override
    public void write(RandomAccessFile file, StudentKey value) throws IOException {
        try {
            file.writeInt(value.getGroupId());
            file.writeUTF(value.getName());
        } catch (IOException e) {
            throw new IOException("An I/O error occurred");
        }
    }
}
