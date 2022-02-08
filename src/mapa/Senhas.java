package mapa;

public class Senhas {
    
    //ATRIBUTOS
    public String tipo;
    public int numero = 0;
  
    
    //MÉTODOS GETTERS e SETTERS
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //MÉTODO TOSTRING
    @Override
    public String toString() {
        return tipo + " - " + numero;
    }

   
          
}
