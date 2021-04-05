/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AdProject.demo.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author abrar.ahamed
 */
@Service
public class AdService {
    
    public String fetchAdBlockStatus(String adStatus){
        
        
        if (adStatus.equals("true")){
           
            return "Ad blocker is enabled";
            
        }
        else if (adStatus.equals("false")){
            return "Ad blocker is disabled";
            
            
        }
           
     
        return "Ad blocker status is unknown";
   
        
    }
    
}
