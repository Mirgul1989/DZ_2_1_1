public final class Daughter extends Mother {
    private String favoriteFood;
    private String favoriteYummy;
    private HairColor hairColor;
    private Hobby hobby;


    public Daughter(int age, String name, HairColor hairСolor, Hobby hobby,
                    String harakter, String adress, String favoriteFood, String favoriteYummy) {
        super(age, name, hairСolor, hobby, harakter, adress);
        this.hairColor = HairColor.RED;
        this.hobby = hobby;
        this.favoriteFood = favoriteFood;
        this.favoriteYummy = favoriteYummy;

    }

    public Daughter(int age, String name, HairColor hairСolor, Hobby hobby,
                    String harakter, String adress, String favoriteYummy) {
        super(age, name, hairСolor, hobby, harakter, adress);

        this.hairColor = HairColor.RED;
        this.hobby = hobby;
        this.favoriteYummy = favoriteYummy;
    }


    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getFavoriteYummy() {
        return favoriteYummy;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nfavoriteFood ( Любимая еда)" + favoriteFood +
                "\nfavoriteYummy ( Любимая вкусняшка)" + favoriteYummy;

    }
    @Override
    public HairColor getHairColor() {
        return hairColor;
    }

    public void song() {
        System.out.println("Ля ля ля!!!");
    }

    public void dance() {
        System.out.println("Ta ram tam tam!!!");
    }
}


