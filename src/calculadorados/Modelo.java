
package calculados;

/**
 *
 * @author Patripon
 */
public class Modelo {
    float num1, num2, resultado;
    String operacion;
    
    public Modelo(){
        num1=0;
        num2=0;
        operacion="";
        resultado=0;     
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    
}
