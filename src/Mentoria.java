import java.time.LocalDate;

public class Mentoria {
    private String tema;

    @Override
    public String toString() {
        return "Mentoria{" +
                "tema='" + tema + '\'' +
                ", dataMentoria=" + dataMentoria +
                '}';
    }

    public Mentoria(String tema, LocalDate dataMentoria) {
        this.tema = tema;
        this.dataMentoria = dataMentoria;
    }

    private LocalDate dataMentoria;

}
