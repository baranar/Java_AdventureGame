public class River extends BattleLocation{
    private boolean awardRiver = false;

    public River(Player player) {
        super(player, "River", new Bear(), "water");
    }

    public boolean isAwardRiver() {
        return awardRiver;
    }

    public void setAwardRiver(boolean awardRiver) {
        this.awardRiver = awardRiver;
    }
}
