
import javax.swing.JOptionPane;


public class gerenteDAO {
    
    public void calcular(gerenteDTO gerentedto){
        int valorfinal = gerentedto.getSalario() + (gerentedto.getAdicional() * 500);
    
        JOptionPane.showMessageDialog(null, "Salário Gerente: R$" + valorfinal);
    }
    
}
