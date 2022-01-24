
public class Player {

    private String name;
    private int score;
    private boolean hold = false;

    public Player(String name) {this.name = name;}

    //getters:
    public String getName() {return name;}
    public int getScore() {return score;}
    public boolean isHeld() {return hold;}

    //setter:
    public void setHold(boolean hold) {this.hold = hold;}

    public void addCard(int c) {
        score += c;
        Util.out(getName() + " drew a " + c);
        if (score == Game.WINNING_SCORE) {
            hold = true;
            Util.out(getName() + " scores " + Game.WINNING_SCORE + "!!!");
        }
        else if (score > Game.WINNING_SCORE) {
            hold = true;
            score = Game.LOSING_SCORE;
            Util.out(getName() + " lost :( ");
        }
    }

    public String toString() {
        return "Player: " + getName() + "'s current score: " + getScore();
    }

}
