package s17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Delimitados {

    public static void ex1() {
        List<Integer> list = new ArrayList<>();
        String path = "./in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String l = br.readLine();
            while (l != null) {
                list.add(Integer.valueOf(l));
                l = br.readLine();
            }

            Integer x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
