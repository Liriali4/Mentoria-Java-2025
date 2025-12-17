package s15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Servidor {

    public static void ex1() {
        File file = new File("in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("[ERROR] : " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public static void ex2() {
        String path = "in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("[EROO]" + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void ex3() {
        String[] lines = new String[]{"Ola servidor", "Protocolo", "Boa noite"};
        String path = "out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[Error] : " + e.getMessage());
        }

    }

    public static void ex4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Folder Path: ");
        String strPath = input.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println("Ficheiros: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Pasta criada com sucesso" + sucess);

        input.close();
    }

    public static void ex5() {
        Scanner input = new Scanner(System.in);
        System.out.print("File Path: ");
        String strPath = input.nextLine();
        File path = new File(strPath);

        System.out.println("GetName: " + path.getName());
        System.out.println("GetParantes " + path.getParent());
        System.out.println("GetPaths " + path.getPath());

        input.close();
    }
}
