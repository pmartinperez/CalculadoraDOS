
package calculadorados;

import javax.swing.JOptionPane;

/**
 *
 * @author Patripon
 */
public class Vista {
    public static void imprimir(Modelo contenedor){
        JOptionPane.showMessageDialog(null,contenedor.getResultado() );
    }
    
    public static void introducirDatos(Modelo contenedor){
        contenedor.setNum1(Float.parseFloat(JOptionPane.showInputDialog("Numero1")));
        contenedor.setNum2(Float.parseFloat(JOptionPane.showInputDialog("Numero2")));
        
        String operacion = JOptionPane.showInputDialog("Operacion");
        if(operacion.equals("+")){
            contenedor.setOperacion(operacion);
        }else if(operacion.equals("-")){
            contenedor.setOperacion(operacion);
        }else if(operacion.equals("*")){
            contenedor.setOperacion(operacion);
        }else if(operacion.equals("/")){
            contenedor.setOperacion(operacion);
        }
    }
}
