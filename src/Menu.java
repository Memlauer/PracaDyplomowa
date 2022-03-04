import java.io.*;
import java.util.Scanner;



public class Menu {

    public static void mainMenu() throws IOException {
        System.out.println("MENU");
        System.out.println("Wybierz opcję");
        System.out.println("1. Moje książki");
        System.out.println("2. Pożyczone ksiązki");
        System.out.println("3. Notatki");
        System.out.println("4. Autorzy");
        System.out.println("5. Koniec");


        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch (option) {
            case 1:
                myBooks();
                break;
            case 2:
                borrowedBooks();
                break;
            case 3:
                notes();
                break;
            case 4:
                authors();
                break;
            case 5:
                end();
                break;
            default:
                System.out.println("Nie ma takiej opcji. Dokonaj wyboru raz jeszcze!");
                mainMenu();
        }
    }
    public static void myBooks() throws IOException {
        System.out.println("MOJE KSIĄŻKI");
        System.out.println("1. Dodaj książkę");
        System.out.println("2. Usuń książkę");
        System.out.println("3. Powrót do MENU");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch (option) {
            case 1:
                System.out.println("Tu w przyszłości będzie można dodać ksiązki i może uda się to jakimś cudem wrzucić do bazy SQL");
                System.out.println("Póki co baw się dalej menu");
                System.out.println(" ");
                myBooks();
                break;
            case 2:
                System.out.println("Tu będzie można usunąć ksiązki i może uda się to jakimś cudem wrzucić do bazy SQL");
                System.out.println("Póki co baw się dalej menu");
                System.out.println(" ");
                myBooks();
                break;
            case 3:
                mainMenu();
                break;
            default:
                System.out.println("Nie ma takiej opcji. Dokonaj wyboru raz jeszcze!");
                myBooks();
        }
    }
    public static void borrowedBooks() throws IOException {
        System.out.println("KSIĄŻKI POŻYCZONE");
        System.out.println("1. Co i komu pożyczyłem");
        System.out.println("2. Co i od kogo pożyczyłem?");
        System.out.println("3. Powrót do MENU");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch (option) {
            case 1:
                System.out.println("Tu w przyszłości wpiszesz co i komu pożyczyłeś może uda się to jakimś cudem wrzucić do bazy SQL");
                System.out.println("Póki co baw się dalej menu");
                System.out.println(" ");
                borrowedBooks();
                break;
            case 2:
                System.out.println("Tu w przyszłości wpiszesz co i od kogo pożyczyłeś i może uda się to jakimś cudem wrzucić do bazy SQL");
                System.out.println("Póki co baw się dalej menu");
                System.out.println(" ");
                borrowedBooks();
                break;
            case 3:
                mainMenu();
                break;
            default:
                System.out.println("Nie ma takiej opcji. Dokonaj wyboru raz jeszcze!");
                borrowedBooks();
        }
    }
    public static void notes() throws IOException {
        System.out.println("Notatki");
        System.out.println();
        System.out.println("1. Dodaj notatkę");
        System.out.println("2. Wczytaj notatki");
        System.out.println("3. Powrót do Menu");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch (option) {
            case 1:
                NotesFile.addNotes();
                break;

            case 2:
                NotesFile.loadNotes();
                break;

            case 3:
            mainMenu();
            break;

            default:
            System.out.println("Nie ma takiej opcji. Wybierz raz jeszcze.");
            notes();
        }
    }

    public static void authors() throws IOException {
        System.out.println("#                   #");
        System.out.println("#       Autorzy     #");
        System.out.println("#                   #");
        System.out.println(" ");
        System.out.println("Autorami programu \"Moja domowa biblioteczka\" są:");
        System.out.println("1.                               ");
        System.out.println("2.                               ");
        System.out.println("3.                               ");
        System.out.println("Program powstał w ramach pracy dyplomwej na kierunku");
        System.out.println("PROGRAMOWANIE APLIKACJI JAVA");
        System.out.println("Wyższa Szkoła Bankowa we Wrocławiu");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Wybierz jakikolwiek numer aby powrócić do MENU");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        if (option > 1) {

            mainMenu();
        }
        else {
            mainMenu();
        }
    }
    public static void end()
    {

    }
    public static void info() {
        System.out.println(" ");
        System.out.println("Witaj w programie \"Moja domowa bibliteczka\"");
        System.out.println(" ");

    }
}