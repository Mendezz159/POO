package src.guia3universidad;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Persona {

    int tipoID; // 1-TI 2-CC 3-CE 4-NIT
    String nroID, nombres,apellidos, direccion;
    Scanner in = new Scanner(System.in);
    public Persona(int tipoID, String nroID, String nombres, String apellidos, String direccion) {
        this.tipoID = tipoID;
        this.nroID = nroID;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }
    
    public Persona(){
        
    }
    
    public void getAll(){
        this.tipoID = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tipo de su ID: "));
        this.nroID = JOptionPane.showInputDialog(null,"Digite el numero de ID: ");
        this.nombres = JOptionPane.showInputDialog(null,"Digite Su nombre (Sin apellidos): ");
        this.apellidos = JOptionPane.showInputDialog(null,"Digite sus apellidos: ");
        this.direccion = JOptionPane.showInputDialog(null,"Digite Dirección: ");
    }
    
    
    @Override
    public String toString() {
        return "tipoID=" + tipoID + ", nroID=" + nroID + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + '}';
    }
    
    public int getTipoID() {
        return tipoID;
    }

    public void setTipoID(int tipoID) {
        this.tipoID = tipoID;
    }

    public String getNroID() {
        return nroID;
    }

    public void setNroID(String nroID) {
        this.nroID = nroID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
