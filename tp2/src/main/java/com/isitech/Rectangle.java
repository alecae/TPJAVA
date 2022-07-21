package com.isitech;

public class Rectangle {
    private int w;
    private int h;

    public Rectangle(int longueur, int largeur) {
        this.w = longueur;
        this.h = largeur;
    }

    public int getWidth() {
        return this.w;
    }

    public int getHeight() {
        return this.h;
    }

    public void display() {
        for (int i = 1; i <= getHeight(); i++) {
            for (int j = 1; j <= getWidth(); j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
