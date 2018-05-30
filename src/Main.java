import Equipment.Avatar;
import Equipment.Shield;
import Equipment.Skill;
import Equipment.Weapon;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //init all class
        Avatar avatar = new Avatar();
        Weapon weapon = new Weapon();
        Shield shield = new Shield();
        Skill skill = new Skill();
        DaftarEquipment daftarEquipment = new DaftarEquipment();
        DaftarUser daftarUser = new DaftarUser();
        User user = new User();
        Fight fight;

        //init all equipment
        daftarEquipment.setAvatar();
        daftarEquipment.setWeapon();
        daftarEquipment.setShield();
        daftarEquipment.setSkill();

        //init scanner
        Scanner sc = new Scanner(System.in);

        //add equipment to user
        daftarUser.setUser("rahman",
                    daftarEquipment.getAvatar(1),
                    daftarEquipment.getWeapon(1),
                    daftarEquipment.getShield(2),
                    daftarEquipment.getSkill(1),
                    100, 0, 0, 0, 100
                );

        daftarUser.setUser("Aulia",
                daftarEquipment.getAvatar(3),
                daftarEquipment.getWeapon(2),
                daftarEquipment.getShield(3),
                daftarEquipment.getSkill(3),
                100,0 , 0, 0, 100
        );
        daftarUser.print();
        fight = new Fight(daftarUser);
        fight.print();


       /* System.out.println("==============");
        System.out.println("|    MENU    |");
        System.out.println("==============");
        System.out.println("1. Play");
        System.out.println("2. Exit");
        System.out.println("Pilihan : ");

        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println("Name for Player 1 : ");
            String namePlayer1 = sc.next();
            daftarEquipment.printAvatar();
            System.out.println("Pilih Character : ");
            int karakterPlayer1 = sc.nextInt();
            daftarEquipment.printWeapon();
            System.out.println("Pilih Senjata : ");
            int senjataPlayer1 = sc.nextInt();
            daftarEquipment.printShield();
            System.out.println("Pilih Perisai : ");
            int perisaiPlayer1 = sc.nextInt();
            daftarEquipment.printSkill();
            System.out.println("Pilih Kemampuan : ");
            int kemampuanPlayer1 = sc.nextInt();

            daftarUser.setUser(namePlayer1,
                    daftarEquipment.getAvatar(karakterPlayer1),
                    daftarEquipment.getWeapon(senjataPlayer1),
                    daftarEquipment.getShield(perisaiPlayer1),
                    daftarEquipment.getSkill(kemampuanPlayer1),
                    100,0 , 0, 0, 100
            );

            System.out.println("Name for Player 2 : ");
            String namePlayer2 = sc.next();
            daftarEquipment.printAvatar();
            System.out.println("Pilih Character : ");
            int karakterPlayer2 = sc.nextInt();
            daftarEquipment.printWeapon();
            System.out.println("Pilih Senjata : ");
            int senjataPlayer2 = sc.nextInt();
            daftarEquipment.printShield();
            System.out.println("Pilih Perisai : ");
            int perisaiPlayer2 = sc.nextInt();
            daftarEquipment.printSkill();
            System.out.println("Pilih Kemampuan : ");
            int kemampuanPlayer2 = sc.nextInt();

            daftarUser.setUser(namePlayer1,
                    daftarEquipment.getAvatar(karakterPlayer2),
                    daftarEquipment.getWeapon(senjataPlayer2),
                    daftarEquipment.getShield(perisaiPlayer2),
                    daftarEquipment.getSkill(kemampuanPlayer2),
                    100,0 , 0, 0, 100
            );
            fight = new Fight(daftarUser);
            fight.print();
        }*/

    }
}
