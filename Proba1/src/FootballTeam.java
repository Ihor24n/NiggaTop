import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.Random;
public class FootballTeam {
    private String teamName;

    private String countryTeam;

    String[] names = { "Ігор", "Максим", "Назар", "Денис", "Віталій", "Сергій", "Іван", "Микола", "Петро", "Генадій","Володимир" };
    public FootballTeam() {
    }

    public void myTeam() {

        Scanner scanner = new Scanner(System.in);
        String[] randomName = new String[20];

        System.out.println("Створюємо команду ... \n" + "Введіть назву команди : ");
        this.teamName = scanner.nextLine();
        System.out.println("Введіть країну вашої команди : ");
        this.countryTeam = scanner.nextLine();

        String[] playerName = new String[11];/////Масив для збереження гравців
        int[] ages = new int[11];/////Масив для збереження віку
        String[] positions = new String[11];/////Масив для збереження позиції

        for (int i = 0; i < 11; i++) {

            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Гравець " + (i + 1) + ":");
            System.out.println("Введіть ім'я вручну(1)/рандом(2) :  "   );
            int u1 = scanner.nextInt();
            if (u1 ==1) {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Введіть ім'я гравця: ");
                playerName[i] = sc1.nextLine(); // Зчитування назви гравців з клавіатури
            }else {
                Collections.shuffle(Arrays.asList(this.names));
                playerName[i] = names[0];
                System.out.println(names[0]);
            }
            System.out.println("Введіть вік вручну(1)/рандом(2) :  "  );
            Scanner sc2 = new Scanner(System.in);
            int u2 = sc2.nextInt();
            if (u2 == 1) {
                Scanner sc3 = new Scanner(System.in);
                System.out.print("Введіть вік гравця: ");
                ages[i] = Integer.parseInt(sc3.nextLine());
            }else{
                Random rand = new Random();
                int n = rand.nextInt(21) + 20;
                System.out.println(n);
                n = ages[0];
            }

            Scanner sc4 = new Scanner(System.in);
            System.out.print("Введіть позицію гравця: ");
            positions[i] = sc4.nextLine();
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Ваша команда :");
        System.out.println("Назва : "+this.teamName);
        System.out.println("Країна : "+ this.countryTeam);

            for (int i = 0; i < 11; i++) {
                System.out.println("Гравець " + (i + 1) + ":");
                System.out.println("Ім'я: " + playerName[i]);
                System.out.println("Вік: " + ages[i]);
                System.out.println("Позиція: " + positions[i]);
                System.out.println();
            }
        }

    }