import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        MaDate date1 = new MaDate(15, 5, 2023);
        MaDate date2 = new MaDate(10, 8, 2022);
        MaDate date3 = new MaDate(2024);


        date3.setJour(1);
        date3.setMois(1);


        System.out.println("Date 1 : " + date1);
        System.out.println("Date 2 : " + date2);
        System.out.println("Date 3 : " + date3);


        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Ajouter un jour");
            System.out.println("2. Ajouter plusieurs jours");
            System.out.println("3. Ajouter un mois");
            System.out.println("4. Ajouter une année");
            System.out.println("5. Quitter");

            System.out.print("Entrez votre choix : ");
            int choix = scanner.nextInt();

            if (choix == 5) {
                System.out.println("9 !");
                break;
            }

            System.out.print("Choisissez la date (1, 2 ou 3) : ");
            int numDate = scanner.nextInt();

            MaDate d4;
            switch (numDate) {
                case 1:
                    d4 = date1;
                    break;
                case 2:
                    d4 = date2;
                    break;
                case 3:
                    d4 = date3;
                    break;
                default:
                    System.out.println("Numéro de date invalide.");
                    continue;
            }

            switch (choix) {
                case 1:
                    d4.ajouterUnJour();
                    System.out.println("Nouvelle date : " +d4);
                    break;
                case 2:
                    System.out.print("Combien de jours ajouter : ");
                    int nbJours = scanner.nextInt();
                    d4.ajouterPlusieursJours(nbJours);
                    System.out.println("Nouvelle date : " + d4);
                    break;
                case 3:
                    d4.ajouterUnMois();
                    System.out.println("Nouvelle date : " + d4);
                    break;
                case 4:
                    d4.ajouterUnAn();
                    System.out.println("Nouvelle date : " +d4);
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
    }
}