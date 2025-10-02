public class Monster extends Character {
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public void attack(Character target) {
        target.takeDamage(9);
    }

    @Override
    public void takeDamage(int damage) {
        damage = damage * 8 / 10;
        super.setHealth(this.getCurrentHealth() - damage);
        if (this.getCurrentHealth() < 0) {
            this.setHealth(0);
        }
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() != 0) {
            return this.getName() + " is a monster with " + this.getCurrentHealth() + " HP";
        }
        return this.getName() + " is a monster and is dead";
    }
}
