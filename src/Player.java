public class Player {
    private String name;
    private int blood;
    private Gun gun;

    public Player(String name, Gun gun) {
        this.name = name;
        this.blood = 5;
        this.gun = gun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public void fire(Player target) {
        if (gun == null) {
            System.out.println(name + " has no gun to fire!");
        } else {
            gun.fire(target);
        }
    }

    public void PlayerStatus() {
        System.out.println(name + " has blood " + blood + " is use: " + gun.name);
    }

    public void takeDamage(int gunDame) {
        if (blood > 0) {
            blood -= gunDame;
            if (blood <= 0) {
                blood = 0;
                System.out.println(name + " is dead!");
            }
            System.out.println(name + " takes " + gunDame + " damage! Remaining blood: " + blood);
        }
    }

    public boolean isAlive() {
        return blood > 0;
    }
}
