public class Shortgun extends Gun {
    public Shortgun() {
        super("Short gun",3);
    }

    @Override
    public void fire(Player target) {
        System.out.println("Firing "+ name + " at " + target.getName());
        target.takeDamage(gunDame);
    }
}
