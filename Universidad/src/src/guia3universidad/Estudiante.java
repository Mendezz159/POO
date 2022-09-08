package src.guia3universidad;

import javax.swing.JOptionPane;

public class Estudiante extends Persona{

    
String codigo;
    public Estudiante(String codigo, int tipoID, String nroID, String nombres, String apellidos, String direccion) {
        super(tipoID, nroID, nombres, apellidos, direccion);
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo +super.toString()+ '}';
    }
    
 @Override
    public void getAll(){
        super.getAll();
        this.codigo = JOptionPane.showInputDialog(null,"Digite el codigo del estudiante: ");
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
   
}
