package com.accijob.basic_api_learning;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PatientRepository {

    Map<Integer,Patient> patientDb=new HashMap<>();

    public String addToDb(Patient patient){
        int key= patient.getPatientID();
        patientDb.put(key,patient);

        return "Patient has been added to DB";
    }

}
