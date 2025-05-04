import java.util.Scanner;
/**
 * Text-Based Adventure Game.
 */
public class EntryPoint {
    public static void main(String[] args) {
        Player player = new Player();//initializing player
//----------------------------------------------------------------------------------------------------------------------
        //Narrative/Choice 1
        System.out.println("You wake up in the forest, dizzy and disoriented");
        System.out.println("Do you go north (1) or stay put (2)?");
        Scanner scnr = new Scanner(System.in);
        int choice1 = scnr.nextInt();
        scnr.nextLine(); //cear next line

        //Path 1
        if(choice1 == 1){
            System.out.println("You go North and come across an untameable river.");
            System.out.println("You attempt to cross it but realize the current is too strong and swim back to shore.");
            player.setHealth(50);
            System.out.println("Your current health is: " + player.getHealth());
            System.out.println("You see a small hut nearby.  Do you investigate (1) or move on (2)?");
            int choice2 = scnr.nextInt();
            if(choice2 == 1){
                System.out.println("You investigate and find some food.");
                player.setHealth(player.getHealth() + 25);
                System.out.println("Current health: " + player.getHealth());
            }
            else if(choice2 == 2){
                System.out.println("You follow the river on the shore, and get scratched by thorns.");
                player.setHealth(player.getHealth() - 10);
                System.out.println("Current Health: " + player.getHealth());
            }
        }
        //Path2
        else if(choice1 == 2){
            System.out.println("You stay put, trying to figure out what to do, and where you're at");
            System.out.println("Suddenly a demon comes and you fight.");
            System.out.println("You barely survive the encounter...");
            player.setHealth(15);
            System.out.println("You current health is: " + player.getHealth());
            System.out.println("You notice a glowing item from the demon's body. Pick up (1) or Ignore (2)");
            int choice3 = scnr.nextInt();

            if(choice3 == 1){
                System.out.println("It's some strange form of magic and your wounds heal");
                player.setHealth(player.getHealth() + 40);
                System.out.println("Current Health: " + player.getHealth());
            }
            else if(choice3 == 2){
                System.out.println("You ignore it and collapse from blood loss");
                player.setHealth(player.getHealth() - 10);
                System.out.println("Current Health: " + player.getHealth());
            }

        }
        else{
            System.out.println("Invalid argument");
        }
//----------------------------------------------------------------------------------------------------------------------

        System.out.println("You come to a narrow trail blocked by a creature....");
        if(player.getHealth() >= 50){
            System.out.println("You fight it off and escape the forest.  You survive!");
        }
        else{
            System.out.println("You're too weak to defend yourself. The forest claims you.");
        }

    }
}
