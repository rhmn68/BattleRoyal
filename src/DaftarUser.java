import Equipment.Avatar;
import Equipment.Shield;
import Equipment.Skill;
import Equipment.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

public class DaftarUser {
    ArrayList<User> arrUser = new ArrayList<>();

    //add user
    public void addUser(User user){
        arrUser.add(user);
    }

    //set User
    public void setUser(String name, Avatar avatar, Weapon weapon, Shield shield, Skill skill, int HP, int intelegence, int strange, int agility, int MP){
        User user;
        user = new User(name,avatar, weapon, shield, skill, HP, intelegence, strange, agility, MP);addUser(user);
    }

    public User getUser(int userId){
        return arrUser.get(userId);
    }

    public int totalHP(int user){
        int totalHP;
        totalHP = arrUser.get(user).getHP() +
                  arrUser.get(user).getAvatar().getStrange() +
                  arrUser.get(user).getShield().getStrange() +
                  arrUser.get(user).getSkill().getStrange() +
                  arrUser.get(user).getWeapon().getStrange();
        return totalHP;
    }

    public int totalMP(int user){
        int totalMP;
        totalMP = arrUser.get(user).getMP() +
                  arrUser.get(user).getAvatar().getIntelegence() +
                  arrUser.get(user).getShield().getIntelegence() +
                  arrUser.get(user).getSkill().getIntelegence() +
                  arrUser.get(user).getWeapon().getIntelegence();
        return totalMP;
    }

    public int totalDamage(int user){
        int totalDamage;
        totalDamage = arrUser.get(user).getAvatar().getDamage() +
                      arrUser.get(user).getShield().getDamage() +
                      arrUser.get(user).getSkill().getDamage() +
                      arrUser.get(user).getWeapon().getDamage();
        return totalDamage;
    }

    public int totalArmor(int user){
        int totalArmor;
        totalArmor = arrUser.get(user).getAvatar().getArmor() +
                     arrUser.get(user).getShield().getArmor() +
                     arrUser.get(user).getSkill().getArmor() +
                     arrUser.get(user).getWeapon().getArmor();
        return totalArmor;
    }

    public void print(){
        int cc = 1;
        int i = 0;
        for (User mUser :  arrUser){
            System.out.println("Player : "+cc);
            System.out.println("Name : "+mUser.getName());
            System.out.println("Avatar : "+mUser.getAvatar().getName());
            System.out.println("Damage : "+totalDamage(i) + "  " + "Armor : "+totalArmor(i));
            System.out.println("str : "+ mUser.getAvatar().getStrange() + " | "+"agi : "+mUser.getAvatar().getAgility()+ " | "+"int : "+mUser.getAvatar().getIntelegence());
            System.out.println("--------------------------");
            System.out.println("|HP BAR : "+totalHP(i)+"            |");
            System.out.println("--------------------------");
            System.out.println("|MP BAR : "+totalMP(i)+"            |");
            System.out.println("--------------------------");
            System.out.println(" ");
            cc += 1;
            i += 1;
        }
    }
}
