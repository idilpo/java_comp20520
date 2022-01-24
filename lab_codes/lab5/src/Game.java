import java.util.ArrayList;

public class Game {

    public static final int WINNING_SCORE = 21;
    public static final int LOSING_SCORE = -1;
    public static enum Command {HOLD, DRAW};
    private ArrayList<Player> players;

    public Game(int numPlayers) { //loop that initializes all players
        players = new ArrayList<Player>();
        for (int i=0; i<numPlayers; i++) {
            players.add(getPlayer());
        }

    }

    public void play() {

        int heldPlayers = 0; //to check players that arent playing, over 21 etc

        /*
        for (type variableName : arrayName) {
            code block to be executed
        }
         */
        for (Player player : players) { // "for-each" loops are used exclusively to loop through elements in an array
            //game starts with two cards, randomly generated between 1-11:
            player.addCard(Util.getRandom(11));
            player.addCard(Util.getRandom(11));

            if (player.isHeld()) {heldPlayers += 1;}
        }


        Command com;
        while (heldPlayers < players.size()) {
            heldPlayers = 0; //initialised to 0 again for the loop

            for (Player player : players) {
                if (!player.isHeld()) { //if the player is holding, we skip them
                    Util.out(player);
                    com = getCommand();

                    switch (com) {
                        case DRAW: player.addCard(Util.getRandom(11)); break;
                        case HOLD: player.setHold(true); break;
                        default: Util.out("Unknown Command: " + com);
                    }
                }

                if (player.isHeld()) {heldPlayers += 1;}
            }
        }

        int highestScore = Game.LOSING_SCORE - 1;
        Player highestPlayer = null;
        boolean draw = false; //two players having the same score
        for (Player player : players) {
            if (player.getScore() == highestScore) {
                draw = true;
            } else if (player.getScore() > highestScore) {
                highestScore = player.getScore();
                highestPlayer = player;
                draw = false;
            }

            if (draw) {
                Util.out("It's a draw between " + player + " and " + highestPlayer + "!");
            } else {
                Util.out(highestPlayer.getName() + " wins with a score of " + highestPlayer.getScore() + "!");
            }
        }

    }


    private Player getPlayer() {
        return new Player(Util.getInput("Please enter your name: "));
    }

    private Command getCommand() {
        String s = Util.getInput("Would you like to DRAW another card or HOLD your current score? ");
        if (s.equalsIgnoreCase("draw")) {return Command.DRAW;}
        else if (s.equalsIgnoreCase("hold")) {return Command.HOLD;}
        else {throw new IllegalArgumentException("Invalid command!!!");}
    }

    public static void main(String[] args) {
        Game g = new Game(3); //default constructor
        g.play();
    }

}
