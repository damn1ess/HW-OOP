public class Hogwarts {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public Hogwarts(String name,
                    int magicPower,
                    int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public String toShowStudent() {
        return "Имя: " + this.name + "\nСила магии: " + this.magicPower + "\nДистанция трансгресии:" + this.transgressionDistance;
    }
    public int sumOfBaseCharacteristics(){
        int sum = this.magicPower + this.transgressionDistance;
        return sum;
    }
    public void toCompareAllStudents(Hogwarts other){
        int sum1 = this.sumOfBaseCharacteristics();
        int sum2 = other.sumOfBaseCharacteristics();
        if (sum1 > sum2) {
            System.out.println(this.name + " - более сильный студент, чем - " + other.name);
        } else {System.out.println(other.name + " - более сильный студент, чем - " + this.name);
        }
    }
}
