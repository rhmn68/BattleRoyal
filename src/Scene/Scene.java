package Scene;

public class Scene {
    String id;
    String deskripsi;

    public Scene(String id, String deskripsi) {
        this.id = id;
        this.deskripsi = deskripsi;
    }

    public void print(){
        System.out.println(deskripsi);
    }
}
