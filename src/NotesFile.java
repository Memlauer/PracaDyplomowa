import java.io.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class NotesFile {


public static String DateToString() {
    String pattern = "dd/MM/yyyy HH:mm:ss";

// Create an instance of SimpleDateFormat used for formatting
// the string representation of date according to the chosen pattern
    DateFormat df = new SimpleDateFormat(pattern);

// Get the today date using Calendar object.
    Date today = Calendar.getInstance().getTime();
// Using DateFormat format method we can create a string
// representation of a date with the defined format.
    String todayAsString = df.format(today);

// Print the result!
    return todayAsString;
}



    public static void addNotes() throws IOException {



        System.out.println("Wpisz co chcesz zanotować:");
        System.out.println("Wprowadź tytuł notatki:");

        Scanner noteTitleScan = new Scanner(System.in);
        String noteTitle = noteTitleScan.nextLine();

        System.out.println("Wprowadź treść notatki:");

        Scanner noteContentScan = new Scanner(System.in);
        String noteContent = noteContentScan.nextLine();

        Writer output = new BufferedWriter(new FileWriter("notes.txt", true));
        output.append("\n");
        output.append("-----------------------------------" + "\n");
        output.append("*** " + noteTitle + " ***" + "\n");
        output.append(noteContent + "\n" + "\n");
        output.append("Dodano:  " + DateToString() + "\n" + "\n");
        output.close();

        Menu.notes();

    }
    public static void loadNotes() throws IOException {

        File file = new File("notes.txt");
        Scanner noteLoad = new Scanner(file);
        while (noteLoad.hasNextLine())
            System.out.println(noteLoad.nextLine());
        noteLoad.close();

        Menu.notes();

    }

}
