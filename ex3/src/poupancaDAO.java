
import javax.swing.JOptionPane;


public class poupancaDAO {
    
    
    public void sacarEdepositar(poupancaDTO poupancadto){
        int saldo = 8000 - poupancadto.getSacar() + poupancadto.getDepositar();
        
        JOptionPane.showMessageDialog(null,"Saldo final: R$" + saldo);
        
    }
}
