import java.util.Random;

public abstract class BattleLocation extends Location{

    private Monster monster;
    private String award;

    public BattleLocation(Player player, String name, Monster monster, String award){
        super(player, name);
        this.setMonster(monster);
        this.setAward(award);
    }

    @Override
    public boolean onLocation(){    //in subclasses: Just Monsters and awards will change
        int monsterNumber = randomMonsterNumber();

        System.out.println("---------  You are in :" + this.getName() + "  ---------");
        System.out.println("Be careful, " + monsterNumber +" "+ this.getMonster().getMonsterName() + " in here");

        System.out.println("Do you want to fight? " +
                "\nY-Yes, I'm brave! " +
                "\nN-No,  I will run away :(");
        String inputForisFight = scan.nextLine().toUpperCase();
        while (!inputForisFight.equals("Y") && !inputForisFight.equals("N")){
            System.out.println("Give me answer!");
            inputForisFight = scan.nextLine().toUpperCase();
        }
        
        if (inputForisFight.equals("Y")){
            if (combat(monsterNumber)){
                System.out.println("\n-----------------------------------------");
                System.out.println(this.getName() + ": All monsters are defeated");
                //Award control
                if (!this.getPlayer().getInventory().isHasFood() && this.getName().equals("Cave")){
                    System.out.println("Food is in your inventory now. WELL DONE!");
                    this.getPlayer().getInventory().setHasFood(true);
                } if (!this.getPlayer().getInventory().isHasFirewood() && this.getName().equals("Forest")){
                    System.out.println("Firewood is in your inventory now. WELL DONE!");
                    this.getPlayer().getInventory().setHasFirewood(true);
                } if (!this.getPlayer().getInventory().isHasWater() && this.getName().equals("River")){
                    System.out.println("Water is in your inventory now. WELL DONE!");
                    this.getPlayer().getInventory().setHasWater(true);
                }
                return true;     //onLocation returns true
            }
        }

        // am i dead or did I run away?
        if (getPlayer().getPlayerHealth() <= 0) {   //if i dead
            System.out.println("-------------- You are Dead!! --------------");
            return false;       //onLocation returns false
        }
        return true;
    }

    //Combat Algorithm
    public boolean combat(int monsterNumber){
        for (int i=1; i<=monsterNumber ; i++){
            this.getMonster().setMonsterHealth(this.getMonster().getDefMonsterHealth());

            getPlayer().getPlayerStats();

            System.out.println(i + ". " + this.getMonster().getMonsterName());
            this.getMonster().getMonsterStats();

            while (this.getPlayer().getPlayerHealth() > 0 && this.getMonster().getMonsterHealth() > 0) {    //Until one of them dies
                System.out.println("<H>it or <R>un");
                String selectCombat = scan.nextLine().toUpperCase();
                if (selectCombat.equals("H")){
                    System.out.println("You Hit the " + this.getMonster().getMonsterName());
                    this.getMonster().setMonsterHealth(getMonster().getMonsterHealth() - getPlayer().getTotalPlayerDamage());
                    afterHit();
                    if (this.getMonster().getMonsterHealth() > 0){
                        System.out.println("\n" + this.getMonster().getMonsterName() + " hit you");
                        int obstacleDamage = this.getMonster().getMonsterDamage() - getPlayer().getInventory().getArmor().getArmorBlock();
                        if (obstacleDamage < 0) { obstacleDamage = 0; }
                        this.getPlayer().setPlayerHealth(this.getPlayer().getPlayerHealth() - obstacleDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }
            }

            if (this.getMonster().getMonsterHealth() < this.getPlayer().getPlayerHealth()){     // if the monster dies
                System.out.println("\nYou defeated the enemy");
                System.out.println("You earn: " + this.getMonster().getMoneyPrize() + " Money");
                getPlayer().setPlayerMoney(getPlayer().getPlayerMoney() + this.getMonster().getMoneyPrize());
                System.out.println("Your current money: " + getPlayer().getPlayerMoney() );
            } else {        //if you die
                return false;
            }
        }
        return true;
    }

    public void afterHit(){
        System.out.println("Your health: " + getPlayer().getPlayerHealth());
        System.out.println(getMonster().getMonsterName() + "'s health: " + getMonster().getMonsterHealth());
    }

    public int randomMonsterNumber(){
        Random r = new Random();
        return r.nextInt(3) + 1;    // [1-3] monsters --> it will be random
        //0,1 --> 1,2
    }

    //getter and setter methods
    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
