import java.util.*;

public class Galaxy {
    private List<CelestialObject> objects = new ArrayList<>();

    public void addCelestialObject(CelestialObject obj) {
        objects.add(obj);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> repartition = new HashMap<>();
        repartition.put("Star", 0);
        repartition.put("Planet", 0);
        repartition.put("Other", 0);

        for (CelestialObject obj : objects) {
            if (obj instanceof Star) {
                repartition.put("Star", repartition.get("Star") + (int) obj.getMass());
            } else if (obj instanceof Planet) {
                repartition.put("Planet", repartition.get("Planet") + (int) obj.getMass());
            } else {
                repartition.put("Other", repartition.get("Other") + (int) obj.getMass());
            }
        }

        return repartition;
    }
}