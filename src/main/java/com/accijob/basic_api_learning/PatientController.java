package com.accijob.basic_api_learning;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

PatientService patientService=new PatientService();
    @PostMapping("/addPatientViaReqBody")
    public String addPatientToDbViaRequestBody(@RequestBody Patient patient) {

        //This class will have endpoint majrly;

        String ans=patientService.addPatientToDb(patient);
        return ans;
    }
    }

