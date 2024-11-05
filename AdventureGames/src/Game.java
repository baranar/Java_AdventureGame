import java.util.Scanner;

public class Game {

    private Scanner scan = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("Please enter your name");
        String playerName = scan.nextLine();
        System.out.println(playerName.toUpperCase() +"," + " Good Luck & Have Fun!!");
        Player player = new Player(playerName);
        player.selectChar();

        while (true){
            player.getPlayerStats();
            System.out.println("\n######### Locations #########:");
            System.out.println("0-Exit the Game\n1-Safe House \n2-Market"+
                    "\n3-Cave   --> There could be Zombies  \t Award: Food" +
                    "\n4-Forest --> There could be Vampires \t Award: Firewood" +
                    "\n5-River  --> There could be Bears    \t Award: Water");

            int selectLocation = scan.nextInt();
            while(selectLocation<0 || selectLocation>5){
                System.out.println("Invalid Value!! Try again...");
                selectLocation = scan.nextInt();
            }

            Location location = null;           // Reference value for use onLocation() method

            switch (selectLocation){
                case 0:
                    break;
                case 1:
                    location = new SafeHouse(player);     //Our player object goes to SafeHouse
                    if (((SafeHouse) location).winTheGame()) {
                        return; // Finish the game
                        // I want to use the WintheGame method, but the Location class does not contain it.
                        // so i did "Type Casting"
                    }
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Please entry a valid location");
            }
            if (location == null) {
                System.out.println("--------- Game OVER ---------");
                break;
            }

            //when onLocation method run, it means i'm in the place
            if (!location.onLocation()){
                System.out.println("-------------- Game OVER --------------");
                break;
            }
        }
    }
}
