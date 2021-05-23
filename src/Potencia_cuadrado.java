// Se importan las clases java.awt.Color, javax.swing.JLabel, javax.swing.JOptionPane y javax.swing.UIManager
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

// Se crea la clase Potencia_cuadrado que hereda de Operaciones
public class Potencia_cuadrado extends Operaciones {
    
    // Se crea el constructor de Potencia_cuadrado que utiliza los parametros obtenidos de Operaciones     
    public Potencia_cuadrado(double v1, double v2) {
        // Super hereda los atributos de Operaciones
        super(v1, v2);
    }
    // Se uiliza el Override para modificar un método ya creado de una clase padre
    @Override
    public void Color(){  
       // Se crea el objeto UI que es de la clase UIManager que es una clase importada
       UIManager UI=new UIManager(); 
       // Se utilizan el método put para asignar los colores de los JOptions gracias a la clase Color
       UI.put("OptionPane.background", Color.yellow); 
       UI.put("Panel.background", Color.yellow);   
    } 
    @Override
    public double No_1(){
        // Se asignan los color del JOption con el método Color
        Color();
         // Se crea un estructura try_catch que permite proteger al programa de errores de ejecución
        try{
        // Se asigna el valor de v1 con el método parseDouble       Se crea el objeto Jlabel para asignar el mesaje , titulo y el tipo de icono    
        v1 = Double.parseDouble(JOptionPane.showInputDialog(null, new JLabel("Ingresa el numero"),"Operación",3)); 
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
    @Override
    public double Operar(){
       // Se iguala la operación al valor obtenido por el método pow que viene de la clase Math a la variable resultado
       resultado = Math.pow(v1, 2);
       // Se retorna el valor de resultado que es de tipo double
       return resultado;
    }
    // Se crea el método que mostrara el resultado de la operación
    public void Mostrar_Potencia_cuadrado(){
          JOptionPane.showMessageDialog(null,v1+ " ^ 2 = " +resultado ,"Potencia al cuadrado",1);
    }
    // Se crea el método Get_Potencia_cuadrado que ejecutara todos los métodos de la clase con solo una llamada
    public void Get_Potencia_cuadrado(){
        No_1();
         // Al ultilizar el botón cancelar se le asignara el valor de 0.00000001 por lo que no se ejecutara lo que sigue del método
         if(v1 != 0.00000001){
            Operar();
            Mostrar_Potencia_cuadrado();
         }
    }
}
