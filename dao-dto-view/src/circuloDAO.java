
import javax.swing.JOptionPane;


public class circuloDAO {
    
    public void formula(CirculoDTO circulodto) {
     double valor = circulodto.getRaio() * 3.14;
     
        JOptionPane.showMessageDialog(null,"Área circulo: " + valor);
    }
}
