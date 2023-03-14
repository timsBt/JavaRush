package com.javarush.level_9;

import java.io.*;

public class Sol_9_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        InputStream fileInputStream = null;

        try {
          fileInputStream = getInputStream(sourceFileName);
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не существует.");
            String source2 = reader.readLine();
            fileInputStream = getInputStream(source2);
        }

            String destinationFileName = reader.readLine();
            OutputStream fileOutputStream = getOutputStream(destinationFileName);
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }

            fileInputStream.close();
            fileOutputStream.close();

    }
    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

