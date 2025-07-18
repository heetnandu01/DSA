package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

//2682 - Find the Losers of the Circular Game
//leetcode link:https://leetcode.com/problems/find-the-losers-of-the-circular-game/description/

public class leetcode2862 {
    public int[] circularGameLosers(int n, int k) {
        boolean[] visited = new boolean[n + 1];
        int currentPlayer = 1;
        int step = 1;
        visited[currentPlayer] = true;
        while (true) {
            int nextPlayer = (currentPlayer + step * k) % n;
            if (nextPlayer == 0) nextPlayer = n;
            if (visited[nextPlayer]) break;
            visited[nextPlayer] = true;
            currentPlayer = nextPlayer;
            step++;
        }
        List<Integer> losers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                losers.add(i);
            }
        }
        int[] result = new int[losers.size()];
        for (int i = 0; i < losers.size(); i++) {
            result[i] = losers.get(i);
        }
        return result;
    }
}

