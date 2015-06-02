package calculadorados;

import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;

@RunWith(Parameterized.class)
public class CalculadoraDOSBateriaTest {
   private float num1, num2;
   private String operacion;
   private float resultado;
   private CalculadoraDOS calculadoraDOS;

   @Before
   public void initialize() {
      calculadoraDOS = new CalculadoraDOS();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
   public CalculadoraDOSBateriaTest(float num1, float num2,
      String operacion, float resultado) {
      this.num1 = num1;
      this.num2 = num2;
      this.operacion = operacion;
      this.resultado = resultado;
   }

   @Parameterized.Parameters
   public static Collection calculadoraNumbers() {
      return Arrays.asList(new Object[][] {
         { 2,3, "+", 5 },
         { 3,5, "+", 8 },
         { 2,2, "*", 4 },
         { 5,3, "-", 2 },
         { 4,3, "+", 7 }
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Ignore
   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + num1 + num2 + "operacion:" + operacion);
      assertEquals(resultado, 
      calculadoraDOS.realizaOperacion(num1,num2,operacion));
   }
}