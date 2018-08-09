package ua.jvdevpro.smlnk;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Использование try с ресурсами;

        try (FileInputStream f = new FileInputStream("a.txt")) {

            System.out.println("aviable byte = " + f.available()); // Сколько байт можно считать с потока;

            byte[] b = new byte[f.available()];

            f.read(b); // Считывание массива с потока байт с потока;

            for (byte a : b) {
                System.out.print((char) a);
            }
        } catch (IOException e) {
            System.out.println("FILE READ ERROR");
        }

    }
}