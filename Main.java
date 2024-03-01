import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] users = {
                {"admin", "password"},
                {"mahasiswa", "123456789012345"}
        };
        String[][] userData = {
                {"Admin", "admin@library.com", "password"},
                {"Mahasiswa", "mahasiswa@library.com", "123456789012345"}
        };
        boolean isLoggedIn = false;
        int userIndex = -1;

        while (!isLoggedIn) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            for (int i = 0; i < users.length; i++) {
                if (username.equals(users[i][0]) && password.equals(users[i][1])) {
                    isLoggedIn = true;
                    userIndex = i;
                    break;
                }
            }

            if (!isLoggedIn) {
                System.out.println("Username atau password salah.");
            }
        }

        System.out.println("Selamat datang, " + userData[userIndex][0] + " (" + userData[userIndex][1] + ")");

        if (userIndex == 0) {
            System.out.println("Anda login sebagai admin.");
            // Proses admin
        } else {
            System.out.println("Anda login sebagai mahasiswa.");
            // Proses mahasiswa
        }
    }
}