public class AlunoDeGraduacao{
    private String nome;
    private int idade;
    private double nota1, nota2, notaFinal;

    //getters/setters
    //tipo de retorno
    //nome
    //lista de parâmetros
    //corpo
    public String getNome(){
        return nome;    
    }
    
    public void setNome(String nome){
        //operador de auto-referência: this 
        this.nome = nome;    
    }
}