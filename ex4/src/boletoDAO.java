
import javax.swing.JOptionPane;


public class boletoDAO {
    
    public void calculo(boletoDTO boletodto){
    int valor = boletodto.getValor();
    
        JOptionPane.showMessageDialog(null,"Valor no boleto: R$" +  valor);
    }
}
