package bootcamp.dominio;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {

    }

    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", getDescricao()=" + getDescricao() + ", getTitulo()=" + getTitulo() + "]";
    }

    

    
}
