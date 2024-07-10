import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Curso> cursosOferecidos;
    private Set<Dev> devsInscritos;


    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.cursosOferecidos = new HashSet<>();
        this.devsInscritos = new HashSet<>();
    }

    public void inscreverDev(Dev d) {
        this.devsInscritos.add(d);
    }

    public void adicionarCurso(Curso c){
        this.cursosOferecidos.add(c);
    }


    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }
}
