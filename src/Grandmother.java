public class Grandmother {
    private int age;
    private String name;
    private String hairСolor;
    private Hobby hobby;

    public Grandmother(int age, String name, HairColor hairColor, Hobby hobby) {
        this.age = age;
        this.name = name;
        this.hairСolor = hairСolor;
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getHairСolor() {
        return hairСolor;
    }

    public Hobby getHobby() {
        return hobby;
    }
}
