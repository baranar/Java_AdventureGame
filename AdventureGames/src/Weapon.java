public class Weapon {
    private int weaponId;
    private String weaponName;
    private int weaponDamage;
    private int weaponPrice;

    public Weapon(String weaponName, int weaponId, int weaponDamage, int weaponPrice){
        this.weaponName = weaponName;
        this.weaponId = weaponId;
        this.weaponDamage = weaponDamage;
        this.weaponPrice = weaponPrice;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponList = {new Pistol(), new Sword(), new Rifle()};
        return weaponList;
    }

    public static Weapon getWeaponObjbyId(int id){
        for (Weapon w: weapons()){
            if (w.getWeaponId() == id){
                return w;
            }
        }
        return null;        // if there is no weapon in this ID this func will return null
    }

    //getter and setter methods
    public int getWeaponId() {
        return weaponId;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getWeaponPrice() {
        return weaponPrice;
    }

    public void setWeaponPrice(int weaponPrice) {
        this.weaponPrice = weaponPrice;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
