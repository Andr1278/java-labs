package com;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.annotation.Annotation;

public class Injector {
    public <T> T Inject(T x) throws IOException, IllegalAccessException, InstantiationException {
        Class classtype = x.getClass();

        Field[] F = classtype.getDeclaredFields();
        for (Field field : F) {
            field.setAccessible(true);
            Annotation a = field.getAnnotation(AutoInjectable.class);
            if (a != null) {
                String type = field.getType().getName();
                Properties properties = new Properties();
                Scanner sc = new Scanner(System.in);
                System.out.println("Input path to properties file: ");
                String path = sc.nextLine();
                sc.close();
                FileInputStream fis = new FileInputStream(path);
                properties.load(fis);
                BufferedReader br = new BufferedReader(new FileReader(path));
                String i;
                do {
                    i = br.readLine();
                    if (i.split("=")[0].equals(type)) {
                        type = i.split("=")[1];
                        break;
                    }
                }
                while (i != null);

                String name = properties.getProperty(type, null);

                Class rel;
                if (name != null) {
                    try {
                        rel = Class.forName(name);
                    } catch (ClassNotFoundException e) {
                        System.out.println("Not found error");
                        continue;
                    }
                    field.set(x, rel.newInstance());
                }
            }
        }
        return x;
    }
}



