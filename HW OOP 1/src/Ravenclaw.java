public class Ravenclaw extends Hogwarts{
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int fullOfCreative;

    public Ravenclaw(String name,
                     int magicPower,
                     int transgressionDistance,
                     int intelligence,
                     int wisdom,
                     int wit,
                     int fullOfCreative) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreative = fullOfCreative;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getFullOfCreative() {
        return fullOfCreative;
    }
    public String toShowStudent() {
        return "Интеллект: " + this.intelligence + "Мудрость: " + this.wisdom +
                "Остроумие: " + this.wit + "Креативность: " + this.fullOfCreative;
    }
    public int sumOfCharacteristics(){
        int sum = this.intelligence + this.wisdom + this.wit + this.fullOfCreative;
        return sum;
    }
    public void toCompareRavenclawStudents(Ravenclaw other){
        int sum1 = this.sumOfCharacteristics();
        int sum2 = other.sumOfCharacteristics();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " - лучший когтевранец, чем - " + other.getName());
        } else {System.out.println(other.getName() + " - лучший когтевранец, чем - " + this.getName());
        }
    }
}
