package bootcamp.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {

    }

    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", getDescricao()=" + getDescricao() + ", getTitulo()="
                + getTitulo() + "]";
    }

    

    

}
