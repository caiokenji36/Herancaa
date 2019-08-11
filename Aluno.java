package herancaa;
//Herança para diferença
//Aluno e uma Especialização de pessoa 
public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    
    

    //Metodos
    public void cancelarMatricula(){
            System.out.println("Voce cancelou sua matricula");
    }
    
    public void pagarMensalidade(){
        System.out.println(this.nome+" pagou a mensalidade");
    }
    
    //Set e Get
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
