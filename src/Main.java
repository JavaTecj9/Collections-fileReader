import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String file1 = fileReader.readFileToString("random.csv");
        System.out.println(file1 + "\n");

        List file2 = fileReader.readFileToList("random.csv");
        System.out.println(file2);

        HashMap<String, String> file3 = fileReader.readFileToHashMap("users.csv");
        System.out.println(file3);

    }
}
