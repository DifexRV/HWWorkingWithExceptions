package service;

import model.Registration;
import Exception.WrongLoginException;
import Exception.WrongPasswordException;
import Exception.WrongConfirmPasswordException;

public class RegistrationServiceImpl implements RegistrationService {

    public static void checkingProfileInformation(Registration registration) throws Exception {
        if (registration.getLogin().length() > 20 || !registration.getLogin().matches("[A-Za-z0-9_]+")) {
            throw new WrongLoginException();
        }
        if (registration.getPassword().length() > 20 || !registration.getPassword().matches("[A-Za-z0-9_]+")) {
            throw new WrongPasswordException();
        }
        if (!registration.getPassword().equals(registration.getConfirmPassword())) {
            throw new WrongConfirmPasswordException();
        } else {
            System.out.println("Поздравляем, " + registration.getLogin() + ", с успешной регистрацией!");
        }

    }

}
