package com.javarush.Level_Core_18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException,UnsupportedFileNameException {
        super(fileName);

        if (!fileName.endsWith(".txt")){
            super.close();
            throw new UnsupportedFileNameException();

        }
    }

    public static void main(String[] args) {
    }
}