public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private boolean hasFood = false;
    private boolean hasFirewood = false;
    private boolean hasWater = false;

    public Inventory(){
        //Default weapon --> Fist
        this.setWeapon(new Weapon("Fist", 0, 0, 0));
        this.setArmor(new Armor("None", 0,0,0));
    }

    //getter and setter methods
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isHasFood() {
        return hasFood;
    }

    public void setHasFood(boolean hasFood) {
        this.hasFood = hasFood;
    }

    public boolean isHasFirewood() {
        return hasFirewood;
    }

    public void setHasFirewood(boolean hasFirewood) {
        this.hasFirewood = hasFirewood;
    }

    public boolean isHasWater() {
        return hasWater;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }
}
