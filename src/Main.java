public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(45);
        boss.setHealth(600);
        boss.setProtection("magic");
        System.out.println("damage: " + boss.getDamage() + "\nhealth: " + boss.getHealth() + "\nprotection: " + boss.getProtection());
    }
}