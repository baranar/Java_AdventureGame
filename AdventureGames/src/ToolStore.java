public class ToolStore extends NormalLocation{
    int balance;

    public ToolStore(Player player) {
        super(player, "Market");
    }

    @Override
    public boolean onLocation() {
        boolean onMarket = true;
        while(onMarket){
            System.out.println("\n------------- Welcome to the Market -------------");
            System.out.println("Select Category: \n1-Weapon\n2-Armor\n3-Exit");
            int selectCategory = scan.nextInt();

            while (selectCategory < 1 || selectCategory > 3) {
                System.out.println("Invalid Value!! Try again...");
                selectCategory = scan.nextInt();
            }

            switch (selectCategory) {
                case 1:
                    printWeapons();
                    buyWeapon();
                    break;
                case 2:
                    printArmors();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("See you later :)");
                    onMarket = false;
                    break;
            }
        }
        return true;
    }

    //Weapon funcs
    public void printWeapons(){
        // Print all weapons
        System.out.println("Enter the ID for select a Weapon");
        System.out.println("ATTENTION: if you already have a weapon, it will be deactivated.");
        for (Weapon w : Weapon.weapons()) {
            System.out.println("ID : " + w.getWeaponId() +
                    "\t Name: " + w.getWeaponName() +
                    "\t Damage: " + w.getWeaponDamage() +
                    "\t Price: " + w.getWeaponPrice());
        }
    }

    public void buyWeapon(){
        // Select a weapon
        int selectWeaponId = scan.nextInt();
        while(selectWeaponId <1 || selectWeaponId > Weapon.weapons().length){
            System.out.println("Invalid value!! Try again...");
            selectWeaponId = scan.nextInt();
        }

        //Buy the selected weapon
        Weapon selectedWeapon = Weapon.getWeaponObjbyId(selectWeaponId);


        if ( selectedWeapon != null){
            if (getPlayer().getPlayerMoney() < selectedWeapon.getWeaponPrice()){
                System.out.println("Transaction failed. Insufficient balance!!");
            } else{
                System.out.println("Transaction successful!");
                System.out.println("Item: " + selectedWeapon.getWeaponName() + " is yours");
                balance = getPlayer().getPlayerMoney() - selectedWeapon.getWeaponPrice();
                getPlayer().setPlayerMoney(balance);
                System.out.println("Your new Balance: " + getPlayer().getPlayerMoney());
                getPlayer().getInventory().setWeapon(selectedWeapon);
            }
        }
    }

    //Armor funcs
    public void printArmors(){
        //print all armors
        System.out.println("Enter the ID for select an armor");
        System.out.println("ATTENTION: if you already have an armor, it will be deactivated.");
        for (Armor armor: Armor.armors()){
            System.out.println("ID: " + armor.getArmorID() +
                    "\t Name: " + armor.getArmorName() +
                    "\t Block: " + armor.getArmorBlock() +
                    "\t Price: " + armor.getArmorPrice());
        }
    }

    public void buyArmor(){
        //Select an armor
        int selectArmorID = scan.nextInt();
        while (selectArmorID <1 || selectArmorID> Armor.armors().length){
            System.out.println("Invalid value!! Try again...");
            selectArmorID = scan.nextInt();
        }

        //Buy the selected armor
        Armor selectedArmor = Armor.getArmorObjbyID(selectArmorID);

        if (selectedArmor != null){
            if (selectedArmor.getArmorPrice() > getPlayer().getPlayerMoney()){
                System.out.println("Transaction failed. Insufficient balance!!");
            } else {
                System.out.println("Transaction successful!");
                System.out.println("Item: " + selectedArmor.getArmorName() + " is yours");
                balance = getPlayer().getPlayerMoney() - selectedArmor.getArmorPrice();
                getPlayer().setPlayerMoney(balance);
                System.out.println("Your new Balance: " + getPlayer().getPlayerMoney());
                getPlayer().getInventory().setArmor(selectedArmor);
            }
        }

    }
}
