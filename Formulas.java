

package projetocalculadora;
public class Formulas {
   private int valor1;
   private int valor2;

    public int getValor() {
        return valor1;
    }
    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }   
    public int getValor2() {
        return valor2;
    }
    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    public int somar(){
        return valor1 + valor2;
    }
    public int subtrair(){
        return valor1 - valor2;
    }
    public int multiplicar(){
        return valor1 * valor2;
    }
    public double dividir(){
        return valor1 / valor2;
    }
   
}
