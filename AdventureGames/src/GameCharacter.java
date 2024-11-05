public abstract class GameCharacter {

    private String charName;
    private int charId;
    private int charDamage;
    private int charHealth;
    private int charMoney;

    public GameCharacter(String charName,int charId, int charDamage, int charHealth, int charMoney){
        this.charName = charName;
        this.charId = charId;
        this.charDamage = charDamage;
        this.charHealth = charHealth;
        this.charMoney = charMoney;
    }

    //Getter methods, no need to setter methods
    public int getId() {
        return charId;
    }

    public int getCharDamage() {
        return charDamage;
    }

    public int getCharHealth() {
        return charHealth;
    }

    public int getCharMoney() {
        return charMoney;
    }

    public String getCharName() {
        return charName;
    }
}
