
import Equipment.Shield;
import Equipment.Skill;
import Equipment.Weapon;
import Equipment.Avatar;

import java.util.HashMap;

public class DaftarEquipment {
    HashMap<Integer, Weapon> arrWeapon = new HashMap<>();
    HashMap<Integer, Shield> arrShield = new HashMap<>();
    HashMap<Integer, Skill> arrSkill = new HashMap<>();
    HashMap<Integer, Avatar> arrAvatar = new HashMap<>();


    //add weapon
    public void addWeapon(Weapon weapon){
        arrWeapon.put(weapon.getId(),weapon);
    }

    //set weapon
    public void setWeapon(){
        Weapon weapon;
        weapon = new Weapon(1, "Pedang",10,0,5,5,10);addWeapon(weapon);
        weapon = new Weapon(2, "Tombak",7,0,5,10,5);addWeapon(weapon);
        weapon = new Weapon(3, "Wand",8,0,10,5,5);addWeapon(weapon);
    }

    //get weapon
    public Weapon getWeapon(int weaponId){
        return arrWeapon.get(weaponId);
    }

    //add shield
    public void addShield(Shield shield){
        arrShield.put(shield.getId(),shield);
    }

    //set shield
    public void setShield(){
        Shield shield;
        shield = new Shield(1, "Shield",0,3,2,3,7);addShield(shield);
        shield = new Shield(2, "Armor",0,5,3,7,3);addShield(shield);
        shield = new Shield(3, "Cloak",0,2,7,3,2);addShield(shield);
    }

    //get shield
    public Shield getShield(int shieldId){
        return arrShield.get(shieldId);
    }

    //add skill
    public void addSkill(Skill skill){
        arrSkill.put(skill.getId(),skill);
    }

    //set skill
    public void setSkill(){
        Skill skill;
        skill = new Skill(1, "Fire",20,0,3,10,6);addSkill(skill);
        skill = new Skill(2, "Lightning",30,0,3,6,4);addSkill(skill);
        skill = new Skill(3, "Water",30,0,3,6,4);addSkill(skill);
        skill = new Skill(4, "Wind",30,0,3,6,4);addSkill(skill);
    }

    //get skill
    public Skill getSkill(int skillId){
        return arrSkill.get(skillId);
    }

    //add Avatar
    public void addAvatar(Avatar avatar){
        arrAvatar.put(avatar.getId(),avatar);
    }

    //set avatar
    public void setAvatar(){
        Avatar avatar;
        avatar = new Avatar(1, "Warior",30,3,5,5,10);addAvatar(avatar);
        avatar = new Avatar(2, "Tanker",10,5,5,10,5);addAvatar(avatar);
        avatar = new Avatar(3, "Wizard",20,2,10,5,5);addAvatar(avatar);
    }

    //get avatar
    public Avatar getAvatar(int avatarId){
        return arrAvatar.get(avatarId);
    }


    public void printWeapon(){
        int cc = 1;
        for (Weapon weapon:arrWeapon.values()){
            System.out.println(cc +". " +weapon.getName());
            cc++;
        }
    }

    public void printShield(){
        int cc = 1;
        System.out.println("");
        for (Shield shield:arrShield.values()){
            System.out.println(cc + ". "+shield.getName());
            cc++;
        }
    }

    public void printSkill(){
        int cc = 1;
        System.out.println("");
        for (Skill skill:arrSkill.values()){
            System.out.println(cc+". "+skill.getName());
            cc++;
        }
    }

    public void printAvatar(){
        int cc = 1;
        System.out.println("");
        for (Avatar avatar:arrAvatar.values()){
            System.out.println(cc+". "+avatar.getName());
            cc++;
        }
    }

    public static void main(String[] args){
        DaftarEquipment daftarEquipment = new DaftarEquipment();

        daftarEquipment.setWeapon();
        daftarEquipment.setAvatar();
        daftarEquipment.setShield();
        daftarEquipment.setSkill();

        daftarEquipment.printWeapon();
        daftarEquipment.printAvatar();
        daftarEquipment.printShield();
        daftarEquipment.printSkill();
    }
}
