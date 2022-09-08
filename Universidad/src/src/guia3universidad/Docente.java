package src.guia3universidad;

import javax.swing.JOptionPane;

public class Docente extends Persona{

 
 int escalafon; // 1-Asistente 2-Asociado
    public Docente(int escalafon, int tipoID, String nroID, String nombres, String apellidos, String direccion) {
        super(tipoID, nroID, nombres, apellidos, direccion);
        this.escalafon = escalafon;
    }
    
    @Override
    public String toString() {
        return "Docente{" + "escalafon=" + escalafon +super.toString()+ '}';
    }
    
 @Override
    public void getAll(){
        super.getAll();
        this.escalafon = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el escalafon del docente: "));
    }

    public int getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(int escalafon) {
        this.escalafon = escalafon;
    }

   
    
}
