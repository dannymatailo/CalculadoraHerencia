/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraherencia;

/**
 *
 * @author labctr
 */
public class CalculadoraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CalculadoraAvanzada calc1=new CalculadoraAvanzada();
       int respuestaSuma=calc1.sumar(4, 6);
       System.out.println("4 + 6 = "+respuestaSuma);
       
       int respuestaResta=calc1.restar(4, 6);
       System.out.println("4 - 6 = "+respuestaResta);
       
       double respuestaMultiplicacion=calc1.multiplicar(4, 6);
       System.out.println("4 * 6 = "+respuestaMultiplicacion);
       
       double respuestaDividir=calc1.dividir(4, 6);
       System.out.println("4 / 6 = "+respuestaDividir);
    }
    
}
