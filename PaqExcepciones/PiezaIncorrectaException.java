package pDesguace.PaqExcepciones;

public class PiezaIncorrectaException extends  Exception {

    public PiezaIncorrectaException(){

    }
    public PiezaIncorrectaException(String msj){
        super(msj);
    }
}
