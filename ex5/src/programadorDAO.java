
import javax.swing.JOptionPane;


public class programadorDAO {
    
    public void calcular(programadorDTO programadordto){
    int valorfinal = programadordto.getSalario() + (programadordto.getAdicional() * 200);
    
        JOptionPane.showMessageDialog(null, "Salário programador: R$" + valorfinal);
        
    }
}
