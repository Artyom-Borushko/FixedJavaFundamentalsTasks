package main.java.RelativePathTasks;

import java.io.*;
import java.util.*;
import java.io.IOException;

public class CollectionsSecondOptionalTask {
    public static void main(String[] args) {
        try {
            File file = new File("data/file.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<String> list = new ArrayList<>();
            System.out.println("Strings in the file: ");
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
                System.out.println(list.get(list.size() - 1));
            }
            System.out.println("Strings in the reverse order: ");
            FileWriter fileWriter = new FileWriter(file);
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
                fileWriter.append(list.get(i) + "\n");
            }
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
