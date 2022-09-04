public class Mother extends Grandmother {
    private String harakter;
    private String adress;
    private HairColor hairColor;
    private Hobby hobby;

    public Mother(int age, String name, HairColor hairColor, Hobby hobby, String harakter, String adress) {
        super(age, name, hairColor, hobby);
        this.harakter = harakter;
        this.adress = adress;
        this.hobby = hobby;
        this.hairColor = hairColor;
        System.out.println("General info:");
    }

    public String getHarakter() {
        return harakter;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public String getAdress() {
        return adress;

    }

    public final void toEat() {
        System.out.println("Блюдо");
    }

    public void toCook(String voice) {
        System.out.println(voice);
    }

    public String getInfo() {
        return "\nname" + getName() +
                "\nHarakter" + harakter +
                "\nAdress" + adress +
                "\nHobby type of class (Тип занятия:)" + hobby.getTypeOfClass() +
                "\nHobby (Хобби:)" + hobby.getHobby() +
                "\nhaircolor (Цвет волос) " + hairColor +
                "\nAge:" + getAge();
    }

    public void callMyDaughter() {
        System.out.println("Дети, идите сюда!");
    }

    @Override
    public Hobby getHobby() {
        return hobby;
    }
}
