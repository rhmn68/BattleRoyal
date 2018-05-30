import Equipment.Avatar;
import Equipment.Shield;
import Equipment.Skill;
import Equipment.Weapon;

public class Main {

    public static void main(String[] args){
        //init all class
        Avatar avatar = new Avatar();
        Weapon weapon = new Weapon();
        Shield shield = new Shield();
        Skill skill = new Skill();
        DaftarEquipment daftarEquipment = new DaftarEquipment();
        DaftarUser daftarUser = new DaftarUser();

        //init all equipment
        daftarEquipment.setAvatar();
        daftarEquipment.setWeapon();
        daftarEquipment.setShield();
        daftarEquipment.setSkill();

        //add equipment to user
        daftarUser.setUser("rahman",
                    daftarEquipment.getAvatar(1),
                    daftarEquipment.getWeapon(1),
                    daftarEquipment.getShield(2),
                    daftarEquipment.getSkill(1),
                    100
                );

        daftarUser.setUser("Aulia",
                daftarEquipment.getAvatar(1),
                daftarEquipment.getWeapon(1),
                daftarEquipment.getShield(2),
                daftarEquipment.getSkill(1),
                100
        );
        daftarUser.print();
    }
}
