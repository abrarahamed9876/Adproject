/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AdProject.demo.controller;

import com.AdProject.demo.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author abrar.ahamed
 */
@Controller
@RequestMapping("/ad")


public class AdController {
    String status;
    
    @Autowired
    AdService adService;
    
    
    

        @GetMapping("/status/{adStatus}")
    public ResponseEntity<String> getStatus(@PathVariable String adStatus) {
        System.out.println("--------------fetching current page status");
        
      status= adService.fetchAdBlockStatus(adStatus);
           
       
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
    
    
    
    
    
    
      @GetMapping("/changestatus")
    public ResponseEntity<String> changeStatus() {
        System.out.println("--------------changing the page status");
      status="Adblocker is not enabled";
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
    
     @GetMapping("/1")
    public String welcome() {
         System.out.println("---------first");
       return "test.html";
    }
    
     @GetMapping("/2")
    public String welcome1() {
         System.out.println("---------second");
       return "index2.html";
    }
    
    
}
