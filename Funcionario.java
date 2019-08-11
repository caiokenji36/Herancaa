package herancaa;
//Herança para diferença
public class Funcionario extends Pessoa{
    //Atributos
    private char Setor;
    private boolean trabalhando;
    
    
    //Metodos
    public void sairTrabalho(){
        if(this.getTrabalhando()){
            this.setTrabalhando(false);
            System.out.println("Voce saiu do trabalho");
        }else{
            System.out.println("Voce nao trabalha");
        }
    }
    
    //Set e Get
    public char getSetor() {
        return Setor;
    }

    public void setSetor(char Setor) {
        this.Setor = Setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
