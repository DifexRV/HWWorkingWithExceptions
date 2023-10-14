package service;

import model.Registration;
import Exception.WrongLoginException;
import Exception.WrongPasswordException;
import Exception.WrongConfirmPasswordException;

public class RegistrationServiceImpl implements RegistrationService {

    public static String checkingProfileInformation(Registration registration) {
        try {
            if (registration.getLogin().length() > 20 || !registration.getLogin().matches("[A-Za-z0-9_]+")) {
                throw new WrongLoginException();
            } else if (registration.getPassword().length() > 20 || !registration.getPassword().matches("[A-Za-z0-9_]+")) {
                throw new WrongPasswordException();
            } else if (!registration.getPassword().equals(registration.getConfirmPassword())) {
                throw new WrongConfirmPasswordException();
            }
        } catch (WrongLoginException | WrongPasswordException | WrongConfirmPasswordException e) {
            e.printStackTrace();
        }
        return null;
    }

}
