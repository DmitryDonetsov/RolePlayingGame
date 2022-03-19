public abstract class Characteristics implements Fighter{
    private String name;
    private int health;
    private int gold;
    private int agility;
    private int experience;
    private int power;

    public Characteristics (String name, int health, int gold, int agility,int experience,int power){
        this.name = name;
        this.health = health;
        this.gold = gold;
        this.agility = agility;
        this. experience = experience;
        this.power = power;
    }
    @Override
    public int attack(){
        if (agility * 3 > getRandomValue()) return power;
        else return 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    private int getRandomValue (){
        return (int) (Math.random()*100);
    }
    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, health);
    }
}

