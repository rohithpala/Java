package Assignment2;

import java.util.Scanner;

class PlayerAttributes {
    String playerName;
    int redCards = 0, yellowCards = 0, goals = 0, assists = 0, substitutions = 0, injuries = 0, offsides = 0;
}

class RedCardThreadClass extends FootballMatch implements Runnable {
    String redCardPlayerName;

    RedCardThreadClass(String playerName) {
        this.redCardPlayerName = playerName;
    }

    public void run() {
        System.out.println(redCardPlayerName + " has been noted upon Red Card");
        for (int iter = 0; iter < numberOfPlayers; iter++) {
            if (players[iter].playerName.equals(this.redCardPlayerName)) {
                players[iter].redCards++;
                if (players[iter].redCards == 2)
                    System.out.println(redCardPlayerName + " cannot play the next 2 matches");
            }
        }
        System.out.println("Data Recorded");
    }
}

class YellowCardThreadClass extends FootballMatch implements Runnable {
    String yellowCardPlayerName;

    YellowCardThreadClass(String playerName) {
        this.yellowCardPlayerName = playerName;
    }

    public void run() {
        System.out.println(yellowCardPlayerName + " has been noted upon Yellow Card");
        for (int iter = 0; iter < numberOfPlayers; iter++) {
            if (players[iter].playerName.equals(this.yellowCardPlayerName))
                players[iter].yellowCards++;
            if (players[iter].yellowCards == 5)
                System.out.println(yellowCardPlayerName + " cannot play the next match");
        }
        System.out.println("Data Recorded");
    }
}

class GoalThreadClass extends FootballMatch implements Runnable {
    String goalScorer, assistPlayer;

    GoalThreadClass(String goalScorer, String assistPlayer) {
        this.goalScorer = goalScorer;
        this.assistPlayer = assistPlayer;
    }

    public void run() {
        System.out.println(goalScorer + " has been noted for goal, assisted by " + assistPlayer + "\nData Recorded");
        for (int iter = 0; iter < numberOfPlayers; iter++) {
            if (players[iter].playerName.equals(this.goalScorer))
                players[iter].goals++;
            if (players[iter].playerName.equals(this.assistPlayer))
                players[iter].assists++;
        }
    }
}

class InjuryThreadClass extends FootballMatch implements Runnable {
    String injuredPlayer;

    InjuryThreadClass(String injuredPlayer) {
        this.injuredPlayer = injuredPlayer;
    }

    public void run() {
        for (int iter = 0; iter < numberOfPlayers; iter++) {
            if (players[iter].playerName.equals(this.injuredPlayer))
                players[iter].injuries++;
        }
    }
}

class SubstitutionThreadClass extends FootballMatch implements Runnable {
    String subPlayer;

    SubstitutionThreadClass(String subPlayer) {
        this.subPlayer = subPlayer;
    }

    public void run() {
        for (int iter = 0; iter < numberOfPlayers; iter++) {
            if (players[iter].playerName.equals(this.subPlayer))
                players[iter].substitutions++;
        }
    }
}

class OffsideThreadClass extends FootballMatch implements Runnable {
    String offsidePlayerName;

    OffsideThreadClass(String offsidePlayerName) {
        this.offsidePlayerName = offsidePlayerName;
    }

    public void run() {
        System.out.println(offsidePlayerName + " committed offside" + "\nData Recorded");
        for (int iter = 0; iter < numberOfPlayers; iter++) {
            if (players[iter].playerName.equals(this.offsidePlayerName))
                players[iter].offsides++;
        }
    }
}

public class FootballMatch {
    public static int numberOfPlayers;
    public static PlayerAttributes[] players = new PlayerAttributes[1000];

    public static void main(String[] args) throws Exception {
        int numberOfPlayersInMain;
        int iter;
        String cmd, playerName, subPlayer;
        Scanner input = new Scanner(System.in);
        Thread foulOrGoalThread;
        System.out.print("Enter number of players: ");
        numberOfPlayersInMain = input.nextInt();
        numberOfPlayers = numberOfPlayersInMain;
        System.out.println("Enter Player Names:");
        for (iter = 0; iter < numberOfPlayersInMain; iter++) {
            players[iter] = new PlayerAttributes();
            players[iter].playerName = input.nextLine();
        }
        while (true) {
            System.out.print("Input: ");
            cmd = input.nextLine();
            switch (cmd.toLowerCase()) {
                case "red card" -> {
                    System.out.println("RedCardThread Reading Data");
                    System.out.print("Enter Red Card Player Name: ");
                    playerName = input.nextLine();
                    foulOrGoalThread = new Thread(new RedCardThreadClass(playerName));
                    foulOrGoalThread.start();
                    foulOrGoalThread.join();
                }
                case "yellow card" -> {
                    System.out.println("YellowCardThread Reading Data");
                    System.out.print("Enter Yellow Card Player Name: ");
                    playerName = input.nextLine();
                    foulOrGoalThread = new Thread(new YellowCardThreadClass(playerName));
                    foulOrGoalThread.start();
                    foulOrGoalThread.join();
                }
                case "goal" -> {
                    System.out.println("GoalThread Reading Data");
                    System.out.print("Enter Goal Scorer Name: ");
                    playerName = input.nextLine();
                    System.out.print("Assisted By: ");
                    String assistPlayer = input.nextLine();
                    foulOrGoalThread = new Thread(new GoalThreadClass(playerName, assistPlayer));
                    foulOrGoalThread.start();
                    foulOrGoalThread.join();
                }
                case "injury" -> {
                    System.out.println("InjuryThread Reading Data");
                    System.out.print("Enter Injured Player: ");
                    playerName = input.nextLine();
                    System.out.print("Doctor! Can " + playerName + " play the match[Y/N]: ");
                    if (input.nextLine().equalsIgnoreCase("y")) {
                        foulOrGoalThread = new Thread(new InjuryThreadClass(playerName));
                        foulOrGoalThread.start();
                        System.out.println(playerName + " got Injured and is well to play the game" + "\nData Recorded");
                    } else {
                        System.out.print("Enter the Name of the substituted player: ");
                        subPlayer = input.nextLine();
                        foulOrGoalThread = new Thread(new SubstitutionThreadClass(subPlayer));
                        foulOrGoalThread.start();
                        System.out.println(playerName + " got Injured and is substituted by " + subPlayer + "\nData Recorded");
                    }
                    foulOrGoalThread.join();
                }
                case "offside" -> {
                    System.out.print("Who Committed Offside: ");
                    playerName = input.nextLine();
                    foulOrGoalThread = new Thread(new OffsideThreadClass(playerName));
                    foulOrGoalThread.start();
                    foulOrGoalThread.join();
                }
            }
        }
    }
}

