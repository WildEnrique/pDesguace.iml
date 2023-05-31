package pDesguace.PaqExcepciones;

public class EstanteriaNoVaciaException extends  Exception {
    public EstanteriaNoVaciaException(){

    }
    public EstanteriaNoVaciaException(String msj){
        super(msj);
    }
}
