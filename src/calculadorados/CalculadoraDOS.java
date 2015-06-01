/*
 * Se introducen dos numeros float y se elige una operacion(+,-,*,/). Se muestra el resultado.
 */
package calculadorados;

import javax.swing.JOptionPane;

/**
 *
 * @author Patripon
 */
public class CalculadoraDOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo contenedor =  new Modelo();
        Vista.imprimir(contenedor); 
        Vista.introducirDatos(contenedor);
        contenedor.setResultado(realizaOperacion(contenedor.getNum1(), contenedor.getNum2(), contenedor.getOperacion()));
        Vista.imprimir(contenedor);
    }

    
    public static float realizaOperacion(float num1, float num2, String operacion){
        float resultado = 0;
        switch(operacion){
            case "+": 
                 resultado = num1+num2;
            break;
            case "-": 
                 resultado = num1-num2;
            break;
            case "*": 
                 resultado = num1*num2;
            break;
            case "/": 
                 resultado = num1/num2;
            break;
        }
        return resultado;
    }
    
    }
    

