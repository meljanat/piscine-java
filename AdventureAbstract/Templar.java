public class Templar extends Character implements Healer, Tank {
    private final int healCapacity, shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public void attack(Character target) {
        heal(this);
        target.takeDamage(6);
    }

    @Override
    public void takeDamage(int damage) {
        damage -= shield;
        super.setCurrentHealth(this.getCurrentHealth() - damage);
        if (this.getCurrentHealth() < 0) {
            this.setCurrentHealth(0);
        }
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character target) {
        target.setCurrentHealth(target.getCurrentHealth() + healCapacity);
        if (target.getCurrentHealth() > target.getMaxHealth()) {
            target.setCurrentHealth(target.getMaxHealth());
        }
    }

    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() == 0) {
            return this.getName() + " has been beaten, even with its " + this.shield + " shield. So bad, it could heal "
                    + this.healCapacity + " HP.";
        }
        return this.getName() + " is a strong Templar with " + this.getCurrentHealth() + " HP. It can heal "
                + this.healCapacity + " HP and has a shield of " + this.shield + ".";
    }
}
