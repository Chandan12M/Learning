package com.core.test;

public class FootBallPenaltyShootout {
	public static void main(String[] args) {
		String teamOne = "MohanBagan";
		String teamTwo = "EastBengal";

		System.out.println(" Welcome match between " + teamOne + " and " + teamTwo);

		int teamOneGoals = 0;
		int teamTwoGoals = 0;

		for (int balls = 0; balls < 5; balls++) {
			teamOneGoals += kickTheBall(teamOne);
			teamTwoGoals += kickTheBall(teamTwo);
			System.out.println(teamOne + " " + teamOneGoals + " - " + teamTwoGoals + " " + teamTwo);
		}

		if (teamOneGoals == teamTwoGoals) {

			System.out.println("It's a tie! We're going to Sudden death ");

		}
		while (teamOneGoals == teamTwoGoals) {
			teamOneGoals += kickTheBall(teamOne);
			teamTwoGoals += kickTheBall(teamTwo);
			System.out.println(teamOne + " " + teamOneGoals + " - " + teamTwoGoals + " " + teamTwo);
		}
		if (teamOneGoals > teamTwoGoals) {
			System.out.println("YESSS!!! " + teamOne + " wins i.e MohanBagan");

		} else {
			System.out.println(
					" " + teamTwo + " beat the MohanBagan side to win the match, " + "What a Game to win here.");
			System.out.println("");
		}
		System.out.println("  " + teamOne + " " + teamOneGoals + " - " + teamTwoGoals + " " + teamTwo + "   |");

	}

	private static int kickTheBall(String team) {
		int goal = Math.random() > 0.5 ? 1 : 0;
		if (goal > 0)
			System.out.println(team + " shoots!");
		else
			System.out.println(team + " missed!");
		return goal;
	}

}
