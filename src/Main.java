public class Main {
    public static void main(String[] args) {
        Hobby hobby = new Hobby("Готовить", "Учительница");
        Mother mother = new Mother(33, " Amina", HairColor.BLACK, hobby, " Позитивная", " Isanova 40");
        System.out.println(mother.getInfo());
        mother.callMyDaughter();
        mother.toCook("готовит вкусную еду");
        mother.toEat();


        Hobby hobby1 = new Hobby("Играть", "Заниматься учебой");
        Daughter daughter = new Daughter(3, "Наиля", HairColor.RED, hobby1, "Стеснительная",
                "Isanova 40", " Манты", " Мороженное");
        System.out.println(daughter.getInfo());
        daughter.song();
        daughter.dance();
        daughter.toCook("помогает сервировать");

        Hobby hobby2 = new Hobby("Танцевать", "Заниматься гимнастикой");
        Daughter daughter2 = new Daughter(8, "Bermet", HairColor.BROWN, hobby2, " Открытая",
                " Isanova 40", " Конфеты");
        System.out.println(daughter2.getInfo());
        daughter2.dance();
        daughter2.toCook("готовит яичницу");
        daughter2.song();

        {

        }
    }
}