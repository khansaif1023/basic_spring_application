package com.accijob.basic_api_learning;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping("v2")
public class ApiClass {
   Map<Integer,Patient> patientDb=new HashMap<>();
    @GetMapping("/getInfo")

    public  String weatherInfo() {

        return "Hi saif all are good";
    }
   @GetMapping ("/addPatientInfo")

   public  String addPatientToDb(@RequestParam("patientId") int patientId,@RequestParam("name") String name,@RequestParam("age") int age,
                                 @RequestParam("disease") String disease){

             Patient patient=new Patient(patientId,name,age,disease);
             int key=patientId;
             patientDb.put(key,patient);
             return "The patient has been added to the DB";
   }


   @PostMapping("/addPatientViaReqBody")
   public String addPatientToDbViaReqBody(@RequestBody Patient patient){
        Integer key=patient.getPatientID();
        patientDb.put(key,patient);
        return "patient has been added to the DB";
   }

   @GetMapping("/getPatientInfo")

   public Patient getPatientInfo(@RequestParam("patientId") Integer patientId){

        Integer key=patientId;
        Patient patient=patientDb.get(key);
        return  patient;
   }


    @GetMapping("/sum")

    public  String sumOfTowNumber(@RequestParam("no1") int number1,@RequestParam("no2") int number2){
        int finalSum=number1+number2;
        return "The sum of entered number"+" "+finalSum;
    }

}
