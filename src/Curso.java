import java.util.Set;

public class Curso {

    private String nome;
    private int cargaHoraria;
    private Set<Bootcamp> bootcamps;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void adicionarBootcamp(Bootcamp b){
        this.bootcamps.add(b);
        b.adicionarCurso(this);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
