package s12.stringbuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Social {

    public static void redeSocial() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha um bom dia");
        Comentario c2 = new Comentario("Feliz dia do Professor");

        Post p1 = new Post(sdf.parse("21/06/2021 13:11:45"),
                "Viagem de férias",
                "Finalmente umas férias",
                15);
        p1.addComentario(c1);
        p1.addComentario(c2);
        
        System.out.println(p1);
        
        Comentario c3= new Comentario("continue!!!");
        Comentario c4 = new Comentario("Força!!");

        Post p2 = new Post(sdf.parse("17/01/2023 13:11:45"),
                "Aprendendo Java",
                "Mergulando no mundo da POO",
                15);
        p2.addComentario(c3);
        p2.addComentario(c4);
        
        System.out.println(p2);
    }
}
