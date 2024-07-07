public class Griffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int courage;

    public Griffindor(String name,
                      int magicPower,
                      int transgressionDistance,
                      int nobility,
                      int honor,
                      int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
    public String toShowStudent() {
        return "Благородство: " + this.nobility + "\nЧесть: " + this.honor +
                "\nХрабрость: " + this.courage;
    }
    public int sumOfCharacteristics(){
        int sum = this.nobility + this.honor + this.courage;
        return sum;
    }
    public void toCompareGriffindorStudents(Griffindor other){
        int sum1 = this.sumOfCharacteristics();
        int sum2 = other.sumOfCharacteristics();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " - лучший гриффиндорец, чем - " + other.getName());
        } else {System.out.println(other.getName() + " - лучший гриффиндорец, чем - " + this.getName());
        }
    }
}
