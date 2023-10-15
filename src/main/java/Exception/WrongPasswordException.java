package Exception;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(){
        super("Некорректный Password, попробуйте еще. Подсказка: Пароль должен состоять не более 20 символов и содержать в себе только латинские буквы, цифры, знак подчеркивания.");
    }

}
