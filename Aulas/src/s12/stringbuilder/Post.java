package s12.stringbuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date data;
    private String titulo;
    private String content;
    private Integer likes;

    private List<Comentario> comentarios = new ArrayList<>();

    public Post() {
    }

    public Post(Date data, String titulo, String content, Integer likes) {
        this.data = data;
        this.titulo = titulo;
        this.content = content;
        this.likes = likes;
    }

    public void addComentario(Comentario c) {
        comentarios.add(c);
    }

    public void removeComentario(Comentario c) {
        comentarios.remove(c);
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" cutidas - ");
        sb.append(sdf.format(data) + "\n");
        sb.append(content + "\n");
        sb.append("Comentários:\n");
        for(Comentario c:comentarios){
            sb.append(" - "+c.getTexto()+"\n");
        }
        
        return sb.toString();
    }

}
