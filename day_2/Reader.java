package day_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Reader {
    private List<String> lines = new ArrayList<String>();

    public Reader() {
        try {

            File input = new File("C:\\Users\\KristoMarleen\\Documents\\advent_of_code_23\\day_2\\input.txt");
            Scanner scan = new Scanner(input);
            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("ei leia faili");
        }

    }

    public String getOneLine(int a) {
        return lines.get(a);
    }

    public List<String> getAll() {
        return lines;
    }

}
