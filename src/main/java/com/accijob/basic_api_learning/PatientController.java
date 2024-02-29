package com.accijob.basic_api_learning;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

PatientService patientService=new PatientService();
    @PostMapping("/addPatientViaReqBody")
    public ResponseEntity addPatientToDbViaRequestBody(@RequestBody Patient patient) {

        //This class will have endpoint majrly;

        String ans=patientService.addPatientToDb(patient);
        return new ResponseEntity(ans,HttpStatus.OK);
    }

    @GetMapping("/findOldestPatient")
    public  ResponseEntity findOldestPatient(){
        Patient ans=patientService.findOldestPatient();

        if(ans==null){
            return  new ResponseEntity("No Patient Were present in DB",HttpStatus.EXPECTATION_FAILED);
        }
        return  new ResponseEntity(ans,HttpStatus.OK);
    }

    @GetMapping("/viewPatient/{patientId}/")

    public ResponseEntity viewPatient(@PathVariable("patientId") Integer patientId){
        Patient patient=patientService.getPatientInfo(patientId);

        if(patient==null){
            return new ResponseEntity("No Valid Patient Found",HttpStatus.BAD_REQUEST);
        }
        return  new ResponseEntity<>(patient,HttpStatus.OK);
    }

    }

