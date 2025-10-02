public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public void attack(Character target) throws DeadCharacterException {
        if (this.getWeapon() != null) {
            try {
                target.takeDamage(this.getWeapon().getDamage());
            } catch (DeadCharacterException e) {
                throw new DeadCharacterException(target);
            }
            return;
        }
        try {
            target.takeDamage(7);
        } catch (DeadCharacterException e) {
            throw new DeadCharacterException(target);
        }
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        damage = damage * 80 / 100;
        super.setCurrentHealth(this.getCurrentHealth() - damage);
        if (this.getCurrentHealth() <= 0) {
            this.setCurrentHealth(0);
            throw new DeadCharacterException(this);
        }
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() != 0) {
            return this.getName() + " is a monster with " + this.getCurrentHealth() + " HP" + ". He has the weapon "
                    + this.getWeapon().toString() + ".";
        }
        return this.getName() + " is a monster and is dead . He has the weapon " + this.getWeapon().toString() + ".";
    }
}
