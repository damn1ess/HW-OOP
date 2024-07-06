public class Hufflepuff extends Hogwarts {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name,
                      int magicPower,
                      int transgressionDistance,
                      int diligence,
                      int loyalty,
                      int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public String toShowStudent() {
        return "Трудолюбие: " + this.diligence + "Верность: " + this.loyalty +
                "Честность: " + this.honesty;
    }
    public int sumOfCharacteristics(){
        int sum = this.diligence + this.loyalty + this.honesty;
        return sum;
    }
    public void toCompareHufflepuffStudents(Hogwarts other){
        int sum1 = this.sumOfCharacteristics();
        int sum2 = other.sumOfCharacteristics();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " - лучший пуффендуец, чем - " + other.getName());
        } else {System.out.println(other.getName() + " - лучший пуффендуец, чем - " + this.getName());
        }
    }
}
