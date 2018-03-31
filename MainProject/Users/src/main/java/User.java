
public class User {


    private String name;
    private String adress;

    public User(String name, String adress) {

        this.name = name;
        this.adress = adress;
    }


    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
