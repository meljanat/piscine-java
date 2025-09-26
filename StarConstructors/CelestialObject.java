public class CelestialObject {
    public String name;
    public double x;
    public double y;
    public double z;
    private int mass;

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public CelestialObject() {
        this.name = "Soleil";
        this.x = 0.0;
        this.y = 0.;
        this.z = .0;
        this.mass = 0;
    }

    public CelestialObject(String name, double x, double y, double z, int mass) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.mass = mass;
    }
}