// Se importan las clases java.awt.Color, javax.swing.JOptionPane y javax.swing.UIManager
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

// Se crea la clase Multiplicación que hereda de Operaciones
public class Multiplicación extends Operaciones {
        
    // Se crea el constructor de Multiplicación que utiliza los parametros obtenidos de Operaciones 
    public Multiplicación (double v1, double v2) {
        // Super hereda los atributos de Operaciones
        super(v1, v2);
    }
     // Se uiliza el Override para modificar un método ya creado de una clase padre
    @Override
    public void Color(){  
       // Se crea el objeto UI que es de la clase UIManager que es una clase importada
       UIManager UI=new UIManager(); 
       // Se utilizan el método put para asignar los colores de los JOptions gracias a la clase Color
       UI.put("OptionPane.background", Color.green); 
       UI.put("Panel.background", Color.green);   
      }
    @Override
    public double Operar(){
       // Se iguala la operación de v1*v2 a la variable resultado
       resultado = v1*v2;
       // Se retorna el valor de resultado que es de tipo double
       return resultado;
    }
    // Se crea el método que mostrara el resultado de la operación
    public void Mostrar_Multiplicación(){
          JOptionPane.showMessageDialog(null,v1 + " * " +v2+ " = " +resultado ,"Multiplicación",1);
    }
    // Se crea el método Get_Multiplicación que ejecutara todos los métodos de la clase con solo una llamada
    public void Get_Multiplicación(){
        No_1();
         // Al ultilizar el botón cancelar se le asignara el valor de 0.00000001 por lo que no se ejecutara lo que sigue del método
        if(v1 != 0.00000001){
            No_2(); 
            if (v2 != 0.00000001){
                Operar();
                Mostrar_Multiplicación();
            }
        }
    }    
}
