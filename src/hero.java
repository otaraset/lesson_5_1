public class hero {

    private int health;

    private int damage;

    private String fireball;

    public hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public hero(int health, int damage, String fireball) {
        this.health = health;
        this.damage = damage;
        this.fireball = fireball;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getFireball() {
        return fireball;
    }
}
