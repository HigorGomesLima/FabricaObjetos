package fabrica;

public class FabricaObjeto {
    public static InstrumentoMusical getObjeto(String nome){
        InstrumentoMusical retorno = null;
        if("violino".equals(nome)){
            retorno = new Violino();
        }else if("guitarra".equals(nome)){
            retorno = new Guitarra();
        }else if("flauta".equals(nome)){
            retorno = new Flauta();
        }
        
        return retorno;
    }
}
