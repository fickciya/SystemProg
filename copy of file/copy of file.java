package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        File source = new File("C:\\Users\\79675\\Desktop\\123.txt");
        File dest = new File("C:\\Users\\79675\\Desktop\\456.txt");
        long start = System.nanoTime();
        copyFileUsingStream(source, dest);
        System.out.println("Время копирования файла = " + (System.nanoTime() - start));
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}