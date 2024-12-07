public class M4A1 extends Gun {
    public M4A1() {
        super("M4A1",1);
    }

    @Override
    public void fire(Player target) {
        System.out.println("Firing "+ name + " at " + target.getName());
        target.takeDamage(gunDame);
    }
}
