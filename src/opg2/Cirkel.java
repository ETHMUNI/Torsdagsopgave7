package opg2;

import static java.lang.Math.PI;

public class Cirkel {

    float radius;


    public Cirkel(float radius) {
        this.radius = radius;
    }

    public double calCirkel() {
        double areal = PI * radius * radius;
        return areal;
    }

    public void setRadius() {
        try {
            calCirkel();
        } catch (Exception e) {
            System.out.println("Kan ikke regne arealen ud med en negativ radius");
        }
    }
}
