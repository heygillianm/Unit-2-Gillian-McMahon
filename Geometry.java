package geometry;

public class Geometry {
    public static void main (String [] args) {
        int sides = 7;
        int radius = 5;
        final double PI = 3.14;
        
        System.out.println("A heptagon has " + sides + " sides");
        
        sides+= 3;
        System.out.println("A decagon has " + sides + " sides");
        
        sides+= 2;
        System.out.println("A dodecagon has " + sides + " sides");
        
        System.out.println("The circumference of a circle with a radius of " + radius);
        radius*=2*PI;
        System.out.println("is " + radius);
      
    }
}