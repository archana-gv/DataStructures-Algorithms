import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TournamentWinner {
    public static void main(String[] args) {

        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);

        ArrayList<String> round1 = new ArrayList<>();
        round1.add("HTML");
        round1.add("C#");

        ArrayList<String> round2 = new ArrayList<>();
        round2.add("C#");
        round2.add("Python");

        ArrayList<String> round3 = new ArrayList<>();
        round3.add("Python");
        round3.add("HTML");

        ArrayList<ArrayList<String>> competions = new ArrayList<ArrayList<String>>();

        competions.add(round1);
        competions.add(round2);
        competions.add(round3);

        String winner = tournamentWinner(competions, results);

        System.out.println(winner);

    }

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        int highestScore = 0;
        String winner = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++) {
            int result = results.get(i);
            String winngTeam = competitions.get(i).get(result == 0 ? 1 : 0);
            int oldScore = map.containsKey(winngTeam) ? map.get(winngTeam) : 0;
            int newScore = oldScore + 3;
            if (newScore > highestScore) {
                highestScore = newScore;
                winner = winngTeam;
            }
            map.put(winngTeam, newScore);
        }
        return winner;
    }
}