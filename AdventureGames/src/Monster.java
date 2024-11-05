public class Monster {

    private int monsterID;
    private String monsterName;
    private int monsterDamage;
    private int monsterHealth;
    private int moneyPrize;
    private int defMonsterHealth;

    public Monster(int monsterID, String monsterName, int monsterDamage, int monsterHealth, int moneyPrize){
        setMonsterID(monsterID);
        setMonsterName(monsterName);
        setMonsterDamage(monsterDamage);
        setMonsterHealth(monsterHealth);
        setMoneyPrize(moneyPrize);
        setDefMonsterHealth(monsterHealth);
    }

    //print monster's stats
    public void getMonsterStats(){
        System.out.println("---------------------------------------------------------");
        System.out.println(getMonsterName() +
                "\tHealth: " + getMonsterHealth() +
                "\tDamage: " + getMonsterDamage());
    }

    //getter and setter methods
    public int getMonsterID() {
        return monsterID;
    }

    public void setMonsterID(int monsterID) {
        this.monsterID = monsterID;
    }

    public int getMonsterDamage() {
        return monsterDamage;
    }

    public void setMonsterDamage(int monsterDamage) {
        this.monsterDamage = monsterDamage;
    }

    public int getMonsterHealth() {
        return monsterHealth;
    }

    public void setMonsterHealth(int monsterHealth) {
        if (monsterHealth <0) { monsterHealth = 0; }
        this.monsterHealth = monsterHealth;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getMoneyPrize() {
        return moneyPrize;
    }

    public void setMoneyPrize(int moneyPrize) {
        this.moneyPrize = moneyPrize;
    }

    public int getDefMonsterHealth() {
        return defMonsterHealth;
    }

    public void setDefMonsterHealth(int defMonsterHealth) {
        this.defMonsterHealth = defMonsterHealth;
    }
}
