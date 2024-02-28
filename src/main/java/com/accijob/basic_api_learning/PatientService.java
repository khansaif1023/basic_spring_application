package com.accijob.basic_api_learning;

import org.springframework.stereotype.Service;

@Service
public class PatientService {

    PatientRepository patientRepository=new PatientRepository();

    public String addPatientToDb(Patient patient){
        //some computution incase is reqired

        // call repository layer
        // that serve to DB

        String response=patientRepository.addToDb(patient);
        return response;
    }
}
