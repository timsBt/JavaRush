package com.javarush.Level_Core_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:\\Users\\timsb\\OneDrive\\Рабочий стол\\JAVA файлы\\Fail.txt";
    FileOutputStream fileOutputStream;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        String s = "JavaRush © All rights reserved.";
        fileOutputStream.write(s.getBytes());
        fileOutputStream.close();
    }

    @Override
    public void flush() throws IOException {

        fileOutputStream.flush();
    }


    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));

    }

}