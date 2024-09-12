
import javax.swing.JOptionPane;


public class RetanguloDAO {

    public void formula(RetanguloDTO retangulodto){
        double valor = retangulodto.getAltura() * retangulodto.getBase();
        
        JOptionPane.showMessageDialog(null, "Área Retangulo: " + valor);
    
    }
    
    
}
