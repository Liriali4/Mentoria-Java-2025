package s16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s16.entidades.Funcionario;

public class InterfaceComparable {
    
    public static void lista() {
        List<Funcionario> list = new ArrayList<>();
        String path = "./in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionario = br.readLine();
            while (funcionario != null) {
                String[] fields = funcionario.split(",");
                list.add(new Funcionario(fields[0], Double.valueOf(fields[1])));
                funcionario = br.readLine();
            }
            Collections.sort(list);
            for (Funcionario f : list) {
                System.out.println(f.getNome() + ", "+f.getSalario());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
