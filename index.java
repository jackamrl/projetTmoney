import java.util.Scanner;

/**
 * BOYODI LONDOU JACQUES
 */
public class index {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int syntaxe = 145; // La syntaxe Tmoney
        String saisi; // La syntaxe saisie par l'utilisateur
        int menu = 0; // Pour le switch
        int montant;
        boolean code;
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
            System.out.println("");
            System.out.println("Entrer le montant : ");
            montant = sc.nextInt();
            break;
        case 2:
            System.out.println("");
            System.out.println("Entrer le montant : ");
            montant = sc.nextInt();
            break;
        case 3:
            System.out.println("");
            System.out.println("1. Recharge");
            System.out.println("2. Forfait internet");
            System.out.println("3. Forfait voix");
            System.out.println("4. Forfait mixte");
            break;
        case 4:
            System.out.println("");
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
            System.out.println("");
            System.out.println("Entrer le montant : ");

            break;
        case 6:
            System.out.println("");
            System.out.println("Choisir la banque: ");
            System.out.println("1. ORABANK");
            System.out.println("2. CAGECFI");
            System.out.println("3. MEDIASOFT");

            break;
        case 7:
            System.out.println("");
            System.out.println("1. Consulter mon solde");
            System.out.println("2. Consulter mes 3 dernieres transactions");
            System.out.println("3. Verifier mon identite");
            System.out.println("4. Gerer mon compte");
            break;
        case 8:
            System.out.println("");
            System.out.println("1. Recuperer mes 3 derniers codes LAFIA (Cash power)");
            System.out.println("2. Renvoyer un code Tcash");
            System.out.println("3. Renitialisation de code secret");
            System.out.println("4. Annuler la transaction");
            break;

        default:
            break;
        }

    }

}
