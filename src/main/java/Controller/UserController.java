/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController  
 @EnableAutoConfiguration  
 public class UserController {  
   @RequestMapping("/")  
   String home() {  
     return "Hello World!";  
   }  
 }  
