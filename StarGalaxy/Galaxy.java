import java.util.*;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject obj) {
        this.celestialObjects.add(obj);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massRepartition = new java.util.HashMap<>();
        massRepartition.put("Star", 0);
        massRepartition.put("Planet", 0);
        massRepartition.put("Other", 0);
        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) {
                massRepartition.put("Star", massRepartition.get("Star") + obj.getMass());
            } else if (obj instanceof Planet) {
                massRepartition.put("Planet", massRepartition.get("Planet") + obj.getMass());
            } else {
                massRepartition.put("Other", massRepartition.get("Other") + obj.getMass());
            }
        }
        return massRepartition;
    }
}