package src.guia3universidad;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Universidad {
// atributos     
// declaracion arreglo Persona
   private static ArrayList<Persona> academicos = new ArrayList<Persona>();

    private static void llenar(int cantidad) {
        Persona tempoEst = new Persona();
        tempoEst.getAll();
        academicos.add(tempoEst);
    }
   private String NIT, Nombre, Direccion;
   Estudiante tempoEst;
   Docente   tempoDoc;
    public Universidad(String NIT, String Nombre, String Direccion) {
        this.NIT = NIT;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }
//    public void registrarAcademicos(){
//        String salida="";
//        tempoEst = new Estudiante("123", 2, "123", "Maria Camila", "Romero","calle 1");
//        academicos.add(tempoEst);
//        tempoDoc = new Docente(2, 2, "606060", "José", "Tellez", "Av. Americas");
//        academicos.add(tempoDoc);
//        salida=academicos.get(0).toString();
//        salida=salida+"\n"+academicos.get(1).toString();
//        System.out.println(""+salida);
//        JOptionPane.showMessageDialog(null, salida);
//        
//        
//    }
    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String tempoNIT, tempoNombre,tempoDir;
//        tempoNIT=JOptionPane.showInputDialog(null,"Digite NIT: ");
//        tempoNombre=JOptionPane.showInputDialog(null,"Digite Nombre: ");
//        tempoDir=JOptionPane.showInputDialog(null,"Digite Dirección: ");
//        Universidad umb = new Universidad(tempoNIT, tempoNombre, tempoDir);
//        umb.registrarAcademicos();

        pedir();
    }
    
    public static void pedir(){
        int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantida de usuario"));
        for (int i = 0; i < cantidadPersonas; i++){
            llenar(cantidadPersonas); 
        } 
        
        String salida="";
        for (int i = 0; i < academicos.size(); i++){
            salida=salida+"\n"+academicos.get(i).toString();
            System.out.println(academicos.get(i).toString());

        }
        JOptionPane.showMessageDialog(null, salida); 
    }
}
