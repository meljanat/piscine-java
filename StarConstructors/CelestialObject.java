public class CelestialObject {
    public String name = "Soleil";
    public double x;
    public double y;
    public double z;

    public CelestialObject CelestialObject(String name, double x, double y, double z) {
        CelestialObject obj = new CelestialObject();
        obj.name = name;
        obj.x = x;
        obj.y = y;
        obj.z = z;
        return obj;
    }
}