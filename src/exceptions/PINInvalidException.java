package exceptions;

public class PINInvalidException extends Exception{
    PINInvalidException(String er_message){
        super(er_message);
    }
}
