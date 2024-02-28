package com.accijob.basic_api_learning;

import org.springframework.stereotype.Service;

import java.util.List;

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

    public  Patient findOldestPatient(){
        List<Patient> patientList=patientRepository.getAllPatients();
        Patient patientAns=null;
        int maxAge=0;
        for(Patient patient:patientList){
            if(patient.getAge()>maxAge){
                maxAge=patient.getAge();
                patientAns=patient;
            }
        }
        return  patientAns;
    }
public  Patient getPatientInfo(Integer patientId){
        List<Patient> patients=patientRepository.getAllPatients();
        return  patients.get(patientId);
}

}
