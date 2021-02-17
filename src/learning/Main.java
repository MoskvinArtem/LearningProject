package learning;

//import java.util.*;
import learning.abstract_factory.*;
import learning.builder.*;

import java.io.*;
import java.math.*;
import learning.prototype.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.*;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


//        String path = "C:/Users/Артём/Desktop/JAVATEXT.txt";
//        String file = ReadFromFile(path);
//        System.out.println(file);
//
//        WriteToFile(path, "Kekekva");
//        file = ReadFromFile(path);
//        System.out.println(file);



//        byte[] array1 = new byte[]{1, 2, 3, 4, 5};
//
//        ByteArrayInputStream bais1 = new ByteArrayInputStream(array1);
//        int b;
//        while ((b = bais1.read()) != -1) {
//            System.out.println(b);
//        }
//
//        String text1 = "Hellova!";
//        byte[] array2 = text1.getBytes();
//
//        ByteArrayInputStream bais2 = new ByteArrayInputStream(array2, 0 ,5);
//        int c;
//
//        while ((c = bais2.read()) != -1) {
//            System.out.println(c);
//        }



//        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
//        String text = "Ohaio! Hello!";
//        byte[] buffer = text.getBytes();
//
//        try
//        {
//            baos1.write(buffer);
//        }
//        catch (IOException ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//
//        System.out.println(baos1.toString());
//        byte[] array = baos1.toByteArray();
//        for (byte b : array) {
//            System.out.println(b);
//            System.out.println((char)b);
//        }

        // Тест строителя
//        Director director = new Director();
//        CarBuilder builder = new CarBuilder();
//
//        director.constructSportsCar(builder);
//        Car car = builder.getResult();
//
//        CarManualBuilder manualBuilder = new CarManualBuilder();
//
//        director.constructSportsCar(manualBuilder);
//        Manual manual = manualBuilder.getResult();
//
//        System.out.println(manual.print());

        // Тест прототипа
//        List<Shape> shapes = new ArrayList<>();
//        List<Shape> shapesCopy = new ArrayList<>();
//
//        Circle circle = new Circle();
//        circle.x = 10;
//        circle.y = 20;
//        circle.radius = 15;
//        circle.color = "red";
//        shapes.add(circle);
//
//        Circle anotherCircle = (Circle) circle.clone();
//        shapes.add(anotherCircle);
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.width = 10;
//        rectangle.height = 25;
//        rectangle.color = "blue";
//        shapes.add(rectangle);
//
//        cloneAndCompare(shapes, shapesCopy);

//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
//
//        t.setName("Vasya");
//
//        System.out.println(t.getName());
//
//        t.setPriority(4);
//        System.out.println(t.getPriority());
//
//        System.out.println(t.isAlive());
//
//        System.out.println("Kva!");



    }




    private static void cloneAndCompare (List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are idential");
                } else {
                    System.out.println(i + ": But they are not idential");
                }
            } else {
                System.out.println(i + ": Shape objects are the same");
            }
        }
    }






    // Функция чтения содержимого из файла
    public static String ReadFromFile (String path) {
        // "C:/Users/Артём/Desktop/JAVATEXT.txt"

        String result = "";
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(path);

            int i = -1;

            while ( (i = fis.read()) != -1 ){
                //System.out.print((char)i);
                result += (char)i;
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            try
            {
                if ( fis != null )
                    fis.close();
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return result;
    }

    // Функция записи в файл
    public static void WriteToFile (String path, String text) {
        //String text = "Hellowa! Ohaio!";

        try (FileOutputStream fos = new FileOutputStream(path))
        {
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}