package org.example;

import model.Registration;
import service.RegistrationServiceImpl;

public class Main {


    public static void main(String[] args) {


        Registration registration = new Registration("Cringe_228", "CriminalBoss_2020", "CriminalBoss_2020");
        Registration registration1 = new Registration("AgentBond-007", "007_Spectrum", "007_Spectrum");
        Registration registration2 = new Registration("AgentBond_007", "007:Spectrum", "007:Spectrum");

        try {
            new RegistrationServiceImpl().checkingProfileInformation(registration);
            new RegistrationServiceImpl().checkingProfileInformation(registration1);
            new RegistrationServiceImpl().checkingProfileInformation(registration2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}