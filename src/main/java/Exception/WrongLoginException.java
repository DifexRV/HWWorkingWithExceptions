package Exception;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super("Некорректный Login, попробуйте еще. Подсказка: Логин должен состоять не более 20 символов и содержать в себе только латинские буквы, цифры, знак подчеркивания.");
    }

}
