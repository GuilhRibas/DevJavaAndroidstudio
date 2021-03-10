/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Guilh
 */
public class Cliente {
    
    private String nome;
    private String email;
    private int idade;
    
    public Cliente(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String  verificarIdade(){
        if (idade < 18) {
            return "menor de idade, livros para maiores de 18 proibidos";
        } else {
            return "maior de idade, livros para maiores de 18 liberados";
        }
    }
    
    @Override
    public String toString(){
        return "nome: "+nome+
                "\nIdade: "+idade+
                "\nEmail: "+email;
    }
}
