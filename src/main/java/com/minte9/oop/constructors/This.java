/**
 * To call another constructor from the same class ...
 * use this() method.
 */

package com.minte9.oop.constructors;

public class This {
    public static void main(String[] args) {
        
        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle(100, 200);
        Rectangle c = new Rectangle(300, 400, 11, 22); // Look Here

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        /*
            W: 0 H: 0 x: 0 y: 0
            W: 100 H: 200 x: 0 y: 0
            W: 300 H: 400 x: 11 y: 22
        */
    }
    
}

class Rectangle {

    private int x, y;
    private int width, height;
    
    public Rectangle() {
        this(0, 0, 0, 0); // Look Here
    }
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int width, int height, int x, int y) {
        this(width, height);
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format(
            "W: %s H: %s x: %s y: %s", width, height, x, y
        );
    }
}
