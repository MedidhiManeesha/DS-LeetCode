import java.util.ArrayList;
import java.util.List;

public class RingaRingaRoses {
    public static void main(String[] args) {
        int n = 5;  // Number of kids
        int m = 3;  // Number of words in the rhyme
        
        GameResult result = simulateGame(n, m);
        System.out.println("Total Rounds: " + result.rounds);
        System.out.println("Elimination Order: " + result.eliminationOrder);
        System.out.println("Winner: " + result.winner);
    }
    
    public static GameResult simulateGame(int n, int m) {
        List<Integer> kids = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            kids.add(i);
        }
        
        int index = 0;
        int rounds = 0;
        List<Integer> eliminationOrder = new ArrayList<>();
        
        while (kids.size() > 1) {
            rounds++;
            index = (index + m - 1) % kids.size();
            eliminationOrder.add(kids.remove(index));
        }
        
        int winner = kids.get(0);
        return new GameResult(rounds, eliminationOrder, winner);
    }
    
    static class GameResult {
        int rounds;
        List<Integer> eliminationOrder;
        int winner;
        
        GameResult(int rounds, List<Integer> eliminationOrder, int winner) {
            this.rounds = rounds;
            this.eliminationOrder = eliminationOrder;
            this.winner = winner;
        }
    }
}
