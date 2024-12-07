abstract class Gun {
    protected String name;
    protected int gunDame;
    public Gun(String name, int gunDame) {
        this.name = name;
        this.gunDame = gunDame;
    }
    public int getDame() {
        return gunDame;
    }

    public abstract void fire(Player target);
}
