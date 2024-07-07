public class Slytherin extends Hogwarts {
    private final int trickery;
    private final int determination;
    private final int ambitiousness;
    private final int ingenuity;
    private final int lustForPower;

    public Slytherin(String name,
                     int magicPower,
                     int transgressionDistance,
                     int trickery,
                     int determination,
                     int ambitiousness,
                     int ingenuity,
                     int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.trickery = trickery;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.ingenuity = ingenuity;
        this.lustForPower = lustForPower;
    }

    public int getTrickery() {
        return trickery;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public String toShowStudent() {
        return "Хитрость: " + this.trickery + "Решительность: " + this.determination + "Амбициозность: " + this.ambitiousness +
                "Находчивость: " + this.ingenuity + "Жажда власти: " + this.lustForPower;
    }
    public int sumOfCharacteristics(){
        int sum = this.trickery + this.determination + this.ambitiousness + this.ingenuity + this.lustForPower;
        return sum;
    }
    public void toCompareSlytherinStudents(Slytherin other){
        int sum1 = this.sumOfCharacteristics();
        int sum2 = other.sumOfCharacteristics();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " - лучший слизеринец, чем - " + other.getName());
        } else {System.out.println(other.getName() + " - лучший слизеринец, чем - " + this.getName());
        }
    }
}
