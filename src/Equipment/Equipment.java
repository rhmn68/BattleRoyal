package Equipment;

public abstract class Equipment {
    protected String name;
    protected int id,damage, armor, intelegence, strange, agility;

    public Equipment() {
    }

    public Equipment(int id, String name, int damage, int armor, int intelegence, int strange, int agility) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.armor = armor;
        this.intelegence = intelegence;
        this.strange = strange;
        this.agility = agility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getIntelegence() {
        return intelegence;
    }

    public void setIntelegence(int intelegence) {
        this.intelegence = intelegence;
    }

    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
}
