
import javax.swing.JOptionPane;


public class trianguloDAO {
    
    public void formula (trianguloDTO triangulodto){
    double valor = triangulodto.getAltura() * triangulodto.getBase() / 2;
    
        JOptionPane.showMessageDialog(null,"Área triângulo:" +  valor);
    
    }
}
