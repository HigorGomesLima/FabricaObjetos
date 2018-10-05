package fabrica;
import javax.swing.JOptionPane;

public class FabricasObjeto {
    
    //Imprimir os dados do objeto
    public static void imprimir(InstrumentoMusical obj){
        String saida = "Nome: " + obj.getNome() + "\n";
        saida += "Tipo: " + obj.getTipo() + "\n";
        saida += "Preço: " + obj.getPreco() + "\n" ;
        JOptionPane.showMessageDialog(null, saida);
    }
   
    public static void main(String[] args) {
        
        boolean controle = true;
        Object[] opcoes = { "violino", "guitarra","flauta"};
        Object instrumento;
        do{
            instrumento = JOptionPane.showInputDialog(null,
                                "Escolha seu instrumento",
                                "Instrumento",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"Doce");
            InstrumentoMusical obj = FabricaObjeto.getObjeto(instrumento.toString());
            imprimir(obj);
        }while(controle);
    } 
}
