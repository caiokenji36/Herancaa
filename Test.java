package herancaa;
public class Test {
    public static void main(String[]args){
        Visitante p1 = new Visitante();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista p5 = new Bolsista();
        
        p2.setNome("Caio");
        p2.setIdade(20);
        p2.fazerAniversario();
        p2.setSexo('M');
        p2.setMatricula(1111);
        p2.setCurso("Informatica");
        p2.pagarMensalidade();
        
        p5.setNome("Joao");
        p5.setIdade(25);
        p5.setSexo('M');
        p5.setMatricula(12111);
        p5.setCurso("Informatica");
        p5.pagarMensalidade();
        
       
        
        p3.setNome("Teddy");
        p3.setSalario(700);
        p3.setIdade(40);
        p3.fazerAniversario();
        p3.receberAumento(400);
        
        System.out.println(p2.toString());
        System.out.println(p5.toString());
        
        
    }
}
