
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
        weapon = new Weapon(1, "Tombak",20,0,3,10,6);addWeapon(weapon);
        weapon = new Weapon(2, "Pedang",30,0,3,6,4);addWeapon(weapon);
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
        shield = new Shield(1, "Tombak",20,0,3,10,6);addShield(shield);
        shield = new Shield(2, "Pedang",30,0,3,6,4);addShield(shield);
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
        skill = new Skill(1, "Tombak",20,0,3,10,6);addSkill(skill);
        skill = new Skill(2, "Pedang",30,0,3,6,4);addSkill(skill);
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
        avatar = new Avatar(1, "Tombak",20,0,3,10,6);addAvatar(avatar);
        avatar = new Avatar(2, "Pedang",30,0,3,6,4);addAvatar(avatar);
    }

    //get avatar
    public Avatar getAvatar(int avatarId){
        return arrAvatar.get(avatarId);
    }


    public void printWeapon(){
        for (Weapon weapon:arrWeapon.values()){
            System.out.println("Name "+weapon.getName());
        }
    }

    public void printShield(){
        System.out.println("");
        for (Shield shield:arrShield.values()){
            System.out.println("Name "+shield.getName());
        }
    }

    public void printSkill(){
        System.out.println("");
        for (Skill skill:arrSkill.values()){
            System.out.println("Name "+skill.getName());
        }
    }

    public void printAvatar(){
        System.out.println("");
        for (Avatar avatar:arrAvatar.values()){
            System.out.println("Name "+avatar.getName());
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
