import java.util.Scanner;

public class Player {

    private int playerDamage;
    private int playerHealth;
    private int defPlayerHealth;
    private int playerMoney;
    private String playersChar;
    private String playerName;
    private Inventory inventory;

    Scanner scan = new Scanner(System.in);

    public Player(String name){
        setPlayerName(name);
        this.setInventory(new Inventory());   //When there are player, there will be inventory
    }

    //Select Character
    public void selectChar(){
        System.out.println("---------------------------------------------");
        System.out.println("Please select your character ID.. \nCharacter stats:");

        GameCharacter[] charList = {new Samurai(), new Archer(), new Knight()};
        //Daha az kod yazmak için liste olarak oluşturdum
        for (GameCharacter gameChar : charList){
            System.out.println("ID: " + gameChar.getId() +
                    "\t Name: " + gameChar.getCharName() +
                    "\t Damage: " + gameChar.getCharDamage() +
                    "\t Health: " + gameChar.getCharHealth() +
                    "\t Money: " + gameChar.getCharMoney());
        }


        int selectChar = scan.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                System.out.println("Invalid Value!! Please Try Again..");
                selectChar();
        }
    }

    //print your Current Stats
    public void getPlayerStats(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Current Stats: \nYour Gun: " + getInventory().getWeapon().getWeaponName() +
                "\tDamage: " + getTotalPlayerDamage()+
                "\nYour Armor: " + getInventory().getArmor().getArmorName() +
                "\tBlock: " + getInventory().getArmor().getArmorBlock() +
                "\nHealth: " + getPlayerHealth() +
                "\nMoney: " + getPlayerMoney());
        System.out.println("---------------------------------------------------------");
    }

    // Initialize the player stats by character
    public void initPlayer(GameCharacter gameCharacter){
        this.setPlayersChar(gameCharacter.getCharName());
        this.setPlayerDamage(gameCharacter.getCharDamage());
        this.setPlayerHealth(gameCharacter.getCharHealth());
        this.setPlayerMoney(gameCharacter.getCharMoney());
        this.setDefPlayerHealth(gameCharacter.getCharHealth());
    }

    // getter and setter methods
   public int getPlayerDamage(){
        return playerDamage;
   }

   public int getTotalPlayerDamage(){
       return playerDamage + getInventory().getWeapon().getWeaponDamage();
       // Default + Weapon damage
       // in this way, you can only one weapon.
   }

   public void setPlayerDamage(int damage){
        this.playerDamage = damage;
   }

   public int getPlayerHealth(){
        return playerHealth;
   }

   public void setPlayerHealth(int playerHealth){
        if (playerHealth <0) { playerHealth = 0; }
       this.playerHealth = playerHealth;
   }

    public int getPlayerMoney() {
        return playerMoney;
    }

    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayersChar() {
        return playersChar;
    }

    public void setPlayersChar(String playersChar) {
        this.playersChar= playersChar;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDefPlayerHealth() {
        return defPlayerHealth;
    }

    public void setDefPlayerHealth(int defPlayerHealth) {
        this.defPlayerHealth = defPlayerHealth;
    }
}
