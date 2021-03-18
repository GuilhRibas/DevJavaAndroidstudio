/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido;

/**
 *
 * @author Guilh
 */
public class Produtos {
    
    public int codigo;
    public String descProd;
    public float preco;
    public int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double calcularValorFinal(){
        return preco*quantidade;
    }
    
    
    
    public void ListarDados(){
        System.out.println("Código: "+codigo);
        System.out.println("Descrição do Produto: "+descProd);
        System.out.println("Preço: "+preco);
        System.out.println("Quantidade: "+quantidade);
    }
    
}
