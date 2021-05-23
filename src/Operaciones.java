
// Se importa las clases javax.swing.JLabel y javax.swing.JOptionPane para utilizar los JOption
import javax.swing.JLabel;
import javax.swing.JOptionPane;

// Se crea la clase Operaciones que sera la clase padre de las demás
public class Operaciones {
       
       //Se declara y se inicializa los atributos globales
       protected double v1 = 0;
       protected double v2 = 0;
       protected double resultado = 0;
          
    // Se crea el método constructor de la clase
    public Operaciones(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    // Se crea el método Color que asignara los colores de los JOption
    public void Color(){  
  
    }
    // Se crea el método No_1 de tipo double que guardara el valor del primer número
    public double No_1() {
         // Se crea un estructura try_catch que permite proteger al programa de errores de ejecución
        try{
        // Se asignan los color del JOption con el método Color
        Color();
        // Se asigna el valor de v1 con el método parseDouble       Se crea el objeto Jlabel para asignar el mesaje , titulo y el tipo de icono
        v1 = Double.parseDouble(JOptionPane.showInputDialog(null, new JLabel("Ingresa el primer valor"),"Operación",3)); 
        // Se retorna el v1 que es de tipo double
        return v1;
        // Excepción de tipo Number: Si se ingresa un valor de tipo String el programa ejecutara el siguiente codigo y si no lo salteara
        }catch(NumberFormatException e ){
            // Se muestra al usuario con una JOption que ingreso un valor incorrecto
            JOptionPane.showMessageDialog(null,"Ingresaste un valor incorrecto ","ERROR",2);
            //Se vuelve a ejecutar el mismo método para entrar en un bubcle hasta ingresar un valor correcto o se seleccione cancelar
            No_1();
        // Excepción de tipo null: Si se selecciona la opción cancelar en el JOption se ejecutara el siguiente codigo y si no lo salteara
        }catch(NullPointerException i ){          
           //Se iguala el valor de .00000001 al v1
            v1 = 0.00000001;
        }
         // Se retorna el v1 que es de tipo double
         return v1;
    }
    // Se crea el método No_2 de tipo double que guardara el valor del segundo número y realiza las mismas intrucciones que el método anterior
       public double No_2(){
        try{
        v2 = Double.parseDouble(JOptionPane.showInputDialog(null, new JLabel("Ingresa el segundo valor"),"Operación",3));   
        return v2;
        }catch(NumberFormatException e ){
          JOptionPane.showMessageDialog(null,"Ingresaste un valor incorrecto ","ERROR",2);
           No_2();
        }catch(NullPointerException i ){          
           v2 = 0.00000001;
        }
        return v2;
    }
       //Se crea el método operar y se retorna un valor de tipo double
       public double Operar(){
       return 0;
    }
}
