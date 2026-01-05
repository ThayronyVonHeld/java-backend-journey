package Module02.Exercicies.Lesson8;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matricula será Cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
