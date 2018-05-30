import java.util.Scanner;

public class Fight {

    private DaftarUser daftarUser;
    int HP;
    Scanner sc = new Scanner(System.in);

    public Fight() {
    }

    public Fight(DaftarUser daftarUser) {
        this.daftarUser = daftarUser;
    }

    public void aksi(){
        do {
            System.out.println("Aksi Player 1 :");
            System.out.println("1. Attack");
            System.out.println("2. Defense");

        }while (HP == 0);
    }

    public int calculateDamagePlayer(int user1,int user2){
        float totalDamage;
        float totalHP;
        float total;
        total = daftarUser.totalArmor(user2) * 10;
        total = total /100;
        totalDamage =  daftarUser.totalDamage(user1) *  total ;
        totalHP = daftarUser.totalHP(user2) - totalDamage;
        return (int) totalHP;
    }

    public void print(){
        System.out.println(calculateDamagePlayer(0,1));
    }
}
