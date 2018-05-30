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
    public void setUser(String name, Avatar avatar, Weapon weapon, Shield shield, Skill skill, int HP){
        User user;
        user = new User(name,avatar, weapon, shield, skill, HP);addUser(user);
    }

    public User getUser(int userId){
        return arrUser.get(userId);
    }

    public void print(){
        int cc = 1;
        for (User mUser :  arrUser){
            System.out.println("ID : "+cc);
            System.out.println("Name : "+mUser.getName());
            System.out.println("Avatar : "+mUser.getAvatar().getName());
            System.out.println("Weapon : "+mUser.getWeapon().getName());
            System.out.println("Shield : "+mUser.getShield().getName());
            System.out.println("Skill : "+mUser.getSkill().getName());
            System.out.println("HP : "+mUser.getHP()+"\n");
            cc += 1;
        }
    }
}
