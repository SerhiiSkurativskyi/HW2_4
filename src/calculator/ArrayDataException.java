package calculator;

public class ArrayDataException extends  RuntimeException{
    public ArrayDataException(String message, NumberFormatException e){
        super(message);
    }
}