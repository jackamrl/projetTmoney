import java.util.Scanner;

/**
 * index
 */
public class index {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int syntaxe = 145; // La syntaxe Tmoney
        String saisi; // La syntaxe saisie par l'utilisateur
        int menu = 0;
        int montant;
        boolean code = false;
        do {
            System.out.println("veuillez entrer la syntaxe Tmoney : ");
            saisi = sc.nextLine();
            if (saisi.equals("*145#")) {
                code = true;
            } else {
                code = false;
            }

        } while (code == false);

        System.out.println("......................................");
        System.out.println("1. Transfert d'argent");
        System.out.println("2. Retrait d'argent");
        System.out.println("3. Achat de crédit et forfait");
        System.out.println("4. Paiement des factures");
        System.out.println("5. Paiement marchand");
        System.out.println("6. Ma Banque/IMF");
        System.out.println("7. Mon compte");
        System.out.println("8. Selfcare");
        System.out.println("......................................");

        menu = sc.nextInt();
        switch (menu) {
        case 1:
            System.out.println("Entrer le montant : ");
            montant = sc.nextInt();
            break;
        case 2:
            System.out.println("Entrer le montant : ");
            montant = sc.nextInt();
            break;
        case 3:
            System.out.println("1. Recharge");
            System.out.println("2. Forfait internet");
            System.out.println("3. Forfait voix");
            System.out.println("4. Forfait mixte");
            break;
        case 4:
            System.out.println("Choisir une catégorie");
            System.out.println("1. Electricité/Eau");
            System.out.println("2. Chaines TV");
            System.out.println("3. Telecoms");
            System.out.println("4. Ecoles/Universites");
            System.out.println("5. Frais/Taxes");
            System.out.println("6. Assurances");
            System.out.println("7. Autres");
            break;
        case 5:

            break;
        case 6:

            break;
        case 7:

            break;
        case 8:

            break;

        default:
            break;
        }

    }

}
