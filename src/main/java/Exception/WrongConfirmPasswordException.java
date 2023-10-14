package Exception;

public class WrongConfirmPasswordException extends Exception {

    public WrongConfirmPasswordException() {
        super("Пароль не подтвержден, попробуйте ввести пароль еще раз. Подсказка: Пароли должны совпадать.");
    }

}
