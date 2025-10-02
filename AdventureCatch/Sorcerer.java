public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public void attack(Character target) throws DeadCharacterException {
        try {
            heal(this);
        } catch (DeadCharacterException e) {
            throw e;
        }
        if (this.getWeapon() != null) {
            try {
                target.takeDamage(this.getWeapon().getDamage());
            } catch (DeadCharacterException e) {
                throw e;
            }
            return;
        }
        try {
            target.takeDamage(10);
        } catch (DeadCharacterException e) {
            throw e;
        }
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        super.setCurrentHealth(this.getCurrentHealth() - damage);
        if (this.getCurrentHealth() <= 0) {
            this.setCurrentHealth(0);
            throw new DeadCharacterException(this);
        }
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character target) throws DeadCharacterException {
        if (target.getCurrentHealth() <= 0) {
            throw new DeadCharacterException(target);
        }
        target.setCurrentHealth(target.getCurrentHealth() + healCapacity);
        if (target.getCurrentHealth() > target.getMaxHealth()) {
            target.setCurrentHealth(target.getMaxHealth());
        }
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() != 0) {
            return this.getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal "
                    + this.healCapacity
                    + " HP." + " He has the weapon " + this.getWeapon().toString() + ".";
        }
        return this.getName() + " is a dead sorcerer. So bad, it could heal " + this.healCapacity + " HP."
                + " He has the weapon " + this.getWeapon().toString() + ".";
    }
}
