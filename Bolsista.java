package herancaa;
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de: "+this.nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome+" Bolsista esta pagando a mensalidade");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
