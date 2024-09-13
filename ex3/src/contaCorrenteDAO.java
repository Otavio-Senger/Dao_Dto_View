
import javax.swing.JOptionPane;


public class contaCorrenteDAO {
    
    
    public void sacarEdepositar(contaCorrenteDTO contacorrentedto){
    int saldo = 5000 - contacorrentedto.getSacar() + contacorrentedto.getDepositar();
    
        JOptionPane.showMessageDialog(null,"Saldo final: R$" + saldo);
    }
}
