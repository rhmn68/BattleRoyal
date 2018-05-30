import Equipment.Avatar;
import Equipment.Shield;
import Equipment.Skill;
import Equipment.Weapon;

public class User {
    private String name;
    private Avatar avatar;
    private Weapon weapon;
    private Shield shield;
    private Skill skill;
    private int HP;

    public User(String name, Avatar avatar, Weapon weapon, Shield shield, Skill skill, int HP) {
        this.name = name;
        this.avatar = avatar;
        this.weapon = weapon;
        this.shield = shield;
        this.skill = skill;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
