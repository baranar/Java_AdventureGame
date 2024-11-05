public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player){
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------------- Welcome to the Safe House!! -------------");
        this.getPlayer().setPlayerHealth(this.getPlayer().getDefPlayerHealth());
        System.out.println("Your health is full now");
        return true;
    }

    public boolean winTheGame(){
        if (this.getPlayer().getInventory().isHasFood() &&
                this.getPlayer().getInventory().isHasFirewood() &&
                this.getPlayer().getInventory().isHasWater()){
            System.out.println("\n--------------------------" +
                    "\nCongratulations, you have won the game by collecting 3 items!" +
                    "\n--------------------------");
            return true;
        }
        return false;
    }
}
