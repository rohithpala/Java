/*
2 Write a program to create a IPL Team with the following properties.
These properties are private (name of the team, number of wins,
number of losses)

i. Create a constructor which accepts values for these variables
and set the class properties to those values.

ii. Create a overloaded constructor that takes only the name of
the team as an argument which will only set the name of the
team and initializes the number of wins and losses to 0.
Demonstrate the use of this keyword, instead of writing the
logic in this constructor

iii. This class will have methods
a. getter and setter methods for all the variables
b. Two methods to increment wins and looses.
c. Method to return Good Team or Bad team if the
Wins:Loses ratio is more than 1.
d. Main method to the IPLTeam class that creates a team
named "Goa Gunners" with 15 wins and 18 losses.
iv. Invoke the method that returns if this team is good or bad
team
v. Subsequently, make five calls to win method and two calls to
lose method.
vi. Specify the output?
*/

package Assignment1;

import java.util.Scanner;

class IPL {
    private String teamName;
    private short wins, loses;

    IPL(String teamName) {
        this.teamName = teamName;
        this.wins = 0;
        this.loses = 0;
    }

    IPL(String teamName, short wins, short loses) {
        this.teamName = teamName;
        this.wins = wins;
        this.loses = loses;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public short getWins() {
        return wins;
    }

    public void setWins(short wins) {
        this.wins = wins;
    }

    public short getLoses() {
        return loses;
    }

    public void setLoses(short loses) {
        this.loses = loses;
    }

    int wins() {
        return this.wins++;
    }

    int loses() {
        return this.loses++;
    }

    String goodOrBad(int winsFromMain, int losesFromMain) {
        if ((winsFromMain / losesFromMain) > 1)
            return "Good";
        return "Bad";
    }
}

public class TeamFeedback {
    public static void main(String[] args) {
        char cmd;
        Scanner input = new Scanner(System.in);
        IPL team = new IPL("Goa Gunners", (short) 15, (short) 18);
        System.out.println(team.getTeamName() + " is a " + team.goodOrBad(team.getWins(), team.getLoses()) + " Team");
        for (int incr = 0; incr < 5; incr++) {
            team.wins();
            if (incr < 2)
                team.loses();
        }
        System.out.println("After " + team.getWins() + " wins and " + team.getLoses() + " loses " + team.getTeamName() + " became " + team.goodOrBad(team.getWins(), team.getLoses()) + " Team");
        do {
            System.out.print("Enter a Team Name: ");
            team.setTeamName(input.next());
            System.out.print("Number of Wins: ");
            team.setWins(input.nextShort());
            System.out.print("Number Of Loses: ");
            team.setLoses(input.nextShort());
            System.out.println(team.getTeamName() + " is a " + team.goodOrBad(team.getWins(), team.getLoses()) + " Team");
            System.out.print("Did " + team.getTeamName() + " finish some Matches after this[Y/N]: ");
            cmd = input.next().charAt(0);
            if (cmd == 'Y' || cmd == 'y') {
                System.out.print("How Many Wins And Loses did the Team Get: ");
                int w = input.nextShort();
                int l = input.nextShort();
                for (int incr = 0; incr < w; incr++) {
                    team.wins();
                    if (incr < l)
                        team.loses();
                }
                System.out.println("After " + team.getWins() + " wins and " + team.getLoses() + " loses " + team.getTeamName() + " became " + team.goodOrBad(team.getWins(), team.getLoses()) + " Team");
            }
            System.out.print("Do You Want To Check The Feedback Of More Teams[Y/N]: ");
            cmd = input.next().charAt(0);
        } while (cmd == 'Y' || cmd == 'y');
        System.out.println("\n\nHave A Nice Day\n");
    }
}