/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public abstract class Game {
    public abstract void initializeGame();
    public abstract void playingGame();
    public abstract void ShowResult();
    public final void writeGame() {
        initializeGame();
        playingGame();
        ShowResult();
    }
}
