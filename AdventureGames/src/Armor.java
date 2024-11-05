public class Armor {

    private int armorID;
    private String armorName;
    private int armorBlock;
    private int armorPrice;

    public Armor(String armorName, int armorID, int armorBlock, int armorPrice ){
        setArmorName(armorName);
        setArmorID(armorID);
        setArmorBlock(armorBlock);
        setArmorPrice(armorPrice);
    }

    public static Armor[] armors(){
        Armor[] armorList = {new LightArmor(), new MediumArmor(), new HeavyArmor()};
        return armorList;
    }

    public static Armor getArmorObjbyID(int id){
        for (Armor armor: armors()){
            if (armor.getArmorID() == id){
                return armor;
            }
        }
        return null;
    }


    //getter and setter methods
    public int getArmorID() {
        return armorID;
    }

    public void setArmorID(int armorID) {
        this.armorID = armorID;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getArmorBlock() {
        return armorBlock;
    }

    public void setArmorBlock(int armorBlock) {
        this.armorBlock = armorBlock;
    }

    public int getArmorPrice() {
        return armorPrice;
    }

    public void setArmorPrice(int armorPrice) {
        this.armorPrice = armorPrice;
    }
}
