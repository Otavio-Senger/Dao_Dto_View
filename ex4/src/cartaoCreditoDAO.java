
import javax.swing.JOptionPane;


public class cartaoCreditoDAO {
    
    public void calcular(cartaoCreditoDTO cartaocredito){
    int valorfinal = cartaocredito.getValor() + cartaocredito.getJuros();
    
        JOptionPane.showMessageDialog(null, "Valor no cartão de crédito: R$" + valorfinal);
    }
}
