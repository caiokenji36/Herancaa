package herancaa;
//Como ela e abstract,entao nao pode ser instanciada 
//so pode servir como progenitora
//Pessoa e uma Generalização de aluno, visitante, funcionario
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected char sexo;
    
    //Metodos
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
        System.out.println("Feliz aniversario "+this.getNome());
    }
    

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
   
    //metodos Set e Get
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade=idade;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo=sexo;
    }
}
