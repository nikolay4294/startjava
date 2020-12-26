package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerRomeoBlue = new Jaeger("Romeo Blue", "Mark-1", "United States of America", 77.72f, 7.77f, 2, 7, 6);
        Jaeger jaegerGipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "United States of America", 79.25f, 1.98f, 7, 8, 6);

        System.out.println("Название робота : " + jaegerRomeoBlue.getModelName());
        System.out.println("Название модели : " + jaegerRomeoBlue.getMark());
        System.out.println("Скорость робота : " + jaegerRomeoBlue.getSpeed());
    }
}
