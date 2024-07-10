import java.util.Set;

public class Dev {
    private String nome;
    private Bootcamp bootcamp;
    private Set<Curso> cursosInscritos;

    public void ingressarBootcamp(Bootcamp b){
        this.bootcamp = b;
        b.inscreverDev(this);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", bootcamp=" + bootcamp +
                ", cursosInscritos=" + cursosInscritos +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void matricularCurso(Curso c){
        this.cursosInscritos.add(c);
    }
}
