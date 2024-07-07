public class Main {
    public static void main(String[] args) {
        Griffindor potter = new Griffindor("Гарри Поттер",
                68,
                63,
                87,
                100,
                90);
        Griffindor granger = new Griffindor("Гермиона Грейнджер",
                95,
                90,
                86,
                81,
                83);
        Griffindor weasley = new Griffindor("Рон Уизли",
                25,
                96,
                44,
                26,
                82);


        Slytherin malfoy = new Slytherin("Драко Малфой",
                33,
                37,
                76,
                46,
                69,
                87,
                21);
        Slytherin montague = new Slytherin("Грэхэм Монтегю",
                57,
                46,
                45,
                64,
                69,
                85,
                23);
        Slytherin goyle = new Slytherin("Грегори Гойл",
                81,
                58,
                49,
                5,
                60,
                99,
                18);
        Hufflepuff smith = new Hufflepuff("Захария Смит",
                73,
                80,
                98,
                46,
                32);
        Hufflepuff diggory = new Hufflepuff("Седрик Диггори",
                94,
                46,
                69,
                12,
                66);
        Hufflepuff finchFletchley = new Hufflepuff("Джастин Финч-Флетчли",
                85,
                8,
                50,
                17,
                69);
        Ravenclaw chang = new Ravenclaw("Чжоу Чанг",
                71,
                11,
                94,
                98,
                12,
                46);
        Ravenclaw patil = new Ravenclaw("Падма Патил",
                21,
                32,
                45,
                61,
                54,
                89);
        Ravenclaw belby = new Ravenclaw("Маркус Белби",
                83,
                23,
                13,
                89,
                99,
                18);
        belby.toCompareRavenclawStudents(patil);
        belby.toCompareAllStudents(patil);
        potter.toCompareGriffindorStudents(granger);
        potter.toCompareAllStudents(granger);
    }
}
