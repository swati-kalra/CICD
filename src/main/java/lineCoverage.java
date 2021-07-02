public class lineCoverage {

    public int findWinnerForSomeGame(int player1, int player2){
        int player1Points = player1; // 19
        int player2Points = player2; // 17

        if(player1Points > 21)  // 19 > 21 = false
            player1Points = 0;
        if(player2Points > 21) // 17 > 21 = false
            player2Points = 0;

        if(player1Points > player2Points) // 19>17 = true
            return player1Points;  // 19
        else
            return player2Points;
    }
}
