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
public class Livro {
    
    private String autor;
    private String editora;
    private String idioma;
    private int anoLanc;
    private Double valor;
    private int paginas;
    
    public Livro(){
        
    }

    public String getAutor() {
        return autor;
    }
    public String getEditora(){
        return editora;
    }
    public String getIdioma(){
        return idioma;
    }
    public int getAnoLanca(){
        return anoLanc;
    }
    public double getValor(){
        return valor;
    }
     public double getPaginas(){
        return paginas;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }
    public void setIdioma(String idioma){
        this.idioma = idioma;
    }
    public void setAnoLanc(int anoLanc){
        this.anoLanc = anoLanc;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    
    public String verificarPaginas(){
        if(paginas>400 || paginas<700){
            return "Livro Com Páginas Médias..";
        }else if(paginas<399){
            return "Livro Com Páginas Pequenas..";
        }else if(paginas>=701){
            return "Livro Com Páginas Grandes..";
        }else{
            return "Páginas não identificadas.";
        }
    }
    
    @Override
    public String toString(){
        return "autor: "+autor+
                "\n Editora: "+editora+
                "\nIdioma: "+idioma+
                "\nAno de lançamento: "+anoLanc+
                "\nValor: "+valor+
                "\nPaginas: "+paginas;
    }
}
