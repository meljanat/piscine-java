public class Star extends CelestialObject {
    private double magnitude;

    public Star() {
        super("Soleil", 0.0, 0.0, 0.0, 0);
        this.magnitude = 0.0;
    }

    public Star(String name, double x, double y, double z, double magnitude, int mass) {
        super(name, x, y, z, mass);
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public String toString() {
        return getName() + " shines at the " + String.format("%.3f", magnitude) + " magnitude";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof Star))
            return false;
        Star other = (Star) obj;
        return Double.compare(magnitude, other.magnitude) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), magnitude);
    }
}