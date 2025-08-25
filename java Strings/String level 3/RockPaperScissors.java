import java.util.Scanner;

public class RockPaperScissors {

    // Method to generate computer's choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0, 1, or 2
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    // Method to determine winner
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";

        return switch (user) {
            case "rock" -> (computer.equals("scissors") ? "user" : "computer");
            case "paper" -> (computer.equals("rock") ? "user" : "computer");
            case "scissors" -> (computer.equals("paper") ? "user" : "computer");
            default -> "invalid";
        };
    }

    // Method to calculate stats and return 2D String array
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[1][0] = "Computer";

        stats[0][1] = String.valueOf(userWins);
        stats[1][1] = String.valueOf(compWins);

        stats[0][2] = String.format("%.2f%%", (userWins * 100.0) / totalGames);
        stats[1][2] = String.format("%.2f%%", (compWins * 100.0) / totalGames);

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("----\t----\t--------\t------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nStats:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("------\t----\t------");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1] + "\t" + stat[2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[n][3]; // user, computer, winner
        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter your choice (rock, paper, scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.print("Invalid choice. Try again (rock, paper, scissors): ");
                userChoice = sc.nextLine().toLowerCase();
            }

            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, n);
        displayResults(gameResults, stats);

        sc.close();
    }
}
