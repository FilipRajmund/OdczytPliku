package pl.FilipRajmund;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("śćł!");
        Path path = Paths.get("src/main/resources/dysk2.txt");
        List<String> strings = Files.readAllLines(path);

        for (String string : strings) {
            System.out.println(string);
        }



    }
}